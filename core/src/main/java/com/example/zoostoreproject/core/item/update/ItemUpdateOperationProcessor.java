package com.example.zoostoreproject.core.item.update;


import com.example.zoostoreproject.api.Item.update.UpdateItemRequest;
import com.example.zoostoreproject.api.Item.update.UpdateItemResponse;
import com.example.zoostoreproject.api.Item.update.UpdateItemOperation;
import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemUpdateOperationProcessor implements UpdateItemOperation {

    private final ItemRepository itemRepository;

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
                .media(item.getMedia())
                .tags(item.getTags())
                .archive(item.getArchived())
                .build();
    }
}
