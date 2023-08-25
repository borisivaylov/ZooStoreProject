package com.example.zoostoreproject.core.item.create;
import com.example.zoostoreproject.api.Item.create.CreateItemRequest;
import com.example.zoostoreproject.api.Item.create.CreateItemResponse;
import com.example.zoostoreproject.api.Item.create.CreateItemOperation;


import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import com.example.zoostoreproject.persistence.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ItemCreateOperationProcessor implements CreateItemOperation {

    private final ItemRepository itemRepository;
    private final VendorRepository vendorRepository;


    @Override
    public CreateItemResponse process(CreateItemRequest createItemRequest) {

        Item item = Item.builder()
                .title(createItemRequest.getTitle())
                .vendorId(createItemRequest.getVendor())
                .description(createItemRequest.getDescription())
                .archived(false)
                .build();

        itemRepository.save(item);

        return CreateItemResponse.builder()
                .id(item.getId())
                .title(createItemRequest.getTitle())
                .description(createItemRequest.getDescription())
                .vendor(vendorRepository.findVendorById(createItemRequest.getVendor()).getVendorName())
                .tags(item.getTags())
                .media(item.getMedia())
                .build();
    }
}
