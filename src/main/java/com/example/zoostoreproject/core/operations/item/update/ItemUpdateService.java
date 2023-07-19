package com.example.zoostoreproject.core.operations.item.update;

import com.example.zoostoreproject.API.Operations.Item.update.UpdateItemRequest;
import com.example.zoostoreproject.API.Operations.Item.update.UpdateItemResponse;
import com.example.zoostoreproject.API.Operations.Item.update.UpdateItemService;
import com.example.zoostoreproject.persistance.entity.Item;
import com.example.zoostoreproject.persistance.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemUpdateService implements UpdateItemService {

    private final ItemRepository itemRepository;

    public Item updateItem(ItemUpdateRequest itemUpdateRequest) {
        Item item = itemRepository.findById(itemUpdateRequest.getId()).orElseThrow(()->
                new IllegalArgumentException("No item with id:"+itemUpdateRequest.getId()));
                item.setTitle(itemUpdateRequest.getTitle());
                item.setDescription(itemUpdateRequest.getDescription());
                item.setVendorId(itemUpdateRequest.getVendor());

                return itemRepository.save(item);

    }

    @Override
    public UpdateItemResponse process(UpdateItemRequest updateItemRequest) {

        Item item = itemRepository.findById(updateItemRequest.getId()).orElseThrow(()->
                new IllegalArgumentException("No item with id:"+updateItemRequest.getId()));
        item.setTitle(updateItemRequest.getTitle());
        item.setDescription(updateItemRequest.getDescription());
        item.setVendorId(updateItemRequest.getVendor());

        itemRepository.save(item);

        return UpdateItemResponse.builder()
                .id(item.getId())
                .title(item.getTitle())
                .vendor(item.getVendorId())
                .description(item.getDescription())
                .archive(item.getArchived())
                .build();
    }
}
