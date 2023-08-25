package com.example.zoostoreproject.core.item.attachTag;

import com.example.zoostoreproject.api.Item.attachTag.AttachTagOperation;
import com.example.zoostoreproject.api.Item.attachTag.AttachTagRequest;
import com.example.zoostoreproject.api.Item.attachTag.AttachTagResponse;
import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.entity.Tag;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import com.example.zoostoreproject.persistence.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

    // Attach a tag to an item.

@Service
@RequiredArgsConstructor
public class AttachTagOperationProcessor implements AttachTagOperation {

    private  final ItemRepository itemRepository;
    private final TagRepository tagRepository;

    @Override
    public AttachTagResponse process(AttachTagRequest attachTagRequest) {

        Item item = itemRepository.findById(attachTagRequest.getItemId()).orElseThrow(()->
                new IllegalArgumentException("Item with ID:" + attachTagRequest.getItemId() + "was not found"));

        Tag tag = tagRepository.findById(attachTagRequest.getTagId()).orElseThrow(()->
                new IllegalArgumentException("Item with ID:" + attachTagRequest.getItemId() + "was not found"));
                item.getTags().add(tag);
                itemRepository.save(item);

        return AttachTagResponse.builder()
                                        .itemId(item.getId())
                                        .tags(item.getTags())
                                        .build();
    }
}
