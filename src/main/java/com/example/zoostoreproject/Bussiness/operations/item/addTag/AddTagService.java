package com.example.zoostoreproject.Bussiness.operations.item.addTag;

import com.example.zoostoreproject.API.Operations.Item.ItemRequest;
import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.Data.entity.Item;
import com.example.zoostoreproject.Data.entity.Tag;
import com.example.zoostoreproject.Data.repository.ItemRepository;
import com.example.zoostoreproject.Data.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class AddTagService {

    private  final ItemRepository itemRepository;

    private final TagRepository tagRepository;

    Item addTag(@RequestBody ItemRequest itemRequest, TagRequest tagRequest){

        Item item = itemRepository.findById(itemRequest.getId()).orElseThrow(()->
                new IllegalArgumentException("Item with ID:" + itemRequest.getId() + "was not found"));
        Tag tag = tagRepository.findById(tagRequest.getId()).orElseThrow(()->
                new IllegalArgumentException("Tag with ID:" + tagRequest.getId() + "was not found"));

                item.getTags().add(tag);

        return itemRepository.save(item);
    }


}
