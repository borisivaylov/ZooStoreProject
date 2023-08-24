package com.example.zoostoreproject.core.item.getItem;

import com.example.zoostoreproject.api.Item.getItem.GetItemRequest;
import com.example.zoostoreproject.api.Item.getItem.GetItemResponse;
import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
@RequiredArgsConstructor
public class GetItemOperationProcessor implements com.example.zoostoreproject.api.Item.getItem.GetItemOperation {

    public final ItemRepository itemRepository;

    @Override
    public GetItemResponse process(GetItemRequest getItemRequest) {

      Item item = itemRepository.findById(getItemRequest.getItemId()).
               orElseThrow(()-> new NoSuchElementException("There is no such item"));

        return GetItemResponse.builder()
                .id(item.getId())
                .title(item.getTitle())
                .description(item.getDescription())
                .vendor(item.getVendorId())
                .tags(item.getTags())
                .media(item.getMedia())
                .archived(item.getArchived())
                .build();
    }
}
