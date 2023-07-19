package com.example.zoostoreproject.core.operations.item.create;

import com.example.zoostoreproject.API.Operations.Item.create.CreateItemRequest;
import com.example.zoostoreproject.API.Operations.Item.create.CreateItemResponse;
import com.example.zoostoreproject.API.Operations.Item.create.CreateItemService;

import com.example.zoostoreproject.persistance.entity.Item;
import com.example.zoostoreproject.persistance.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemCreateService implements CreateItemService {

    private final ItemRepository itemRepository;

    @Override
    public CreateItemResponse process(CreateItemRequest createItemRequest) {

        Item item = Item.builder()
                .title(createItemRequest.getTitle())
                .vendorId(createItemRequest.getVendor())
                .description(createItemRequest.getDescription())
                .build();

        itemRepository.save(item);

        return CreateItemResponse.builder()
                .id(item.getId())
                .title(createItemRequest.getTitle())
                .description(createItemRequest.getDescription())
                .vendor(createItemRequest.getVendor())
                .tags(item.getTags())
                .media(item.getMedia())
                .build();
    }
}
