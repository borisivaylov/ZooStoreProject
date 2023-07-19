package com.example.zoostoreproject.core.operations.item.attachTag;

import com.example.zoostoreproject.API.Operations.Item.attachTag.AttachTagRequest;
import com.example.zoostoreproject.API.Operations.Item.attachTag.AttachTagResponse;
import com.example.zoostoreproject.persistance.entity.Item;
import com.example.zoostoreproject.persistance.entity.Tag;
import com.example.zoostoreproject.persistance.repository.ItemRepository;
import com.example.zoostoreproject.persistance.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttachTagService implements com.example.zoostoreproject.API.Operations.Item.attachTag.AttachTagService {

    private  final ItemRepository itemRepository;

    private final TagRepository tagRepository;

    @Override
    public AttachTagResponse process(AttachTagRequest attachTagRequest) {
        Item item = itemRepository.findById(attachTagRequest.getItemId()).orElseThrow(()->
                new IllegalArgumentException("Item with ID:" + attachTagRequest.getItemId() + "was not found"));
        Tag tag = tagRepository.findById(attachTagRequest.getTagId()).orElseThrow(()->
                new IllegalArgumentException("Tag with ID:" + attachTagRequest.getTagId() + "was not found"));

        item.getTags().add(tag);
        itemRepository.save(item);

        return AttachTagResponse.builder()
                                        .itemId(item.getId())
                                        .tags(item.getTags())
                                        .build();
    }
}
