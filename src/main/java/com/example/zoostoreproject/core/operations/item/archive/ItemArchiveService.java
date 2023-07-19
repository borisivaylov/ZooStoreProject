package com.example.zoostoreproject.core.operations.item.archive;

import com.example.zoostoreproject.API.Operations.Item.archive.ItemArchiveRequest;
import com.example.zoostoreproject.API.Operations.Item.archive.ItemArchiveResponse;
import com.example.zoostoreproject.persistance.entity.Item;
import com.example.zoostoreproject.persistance.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemArchiveService implements com.example.zoostoreproject.API.Operations.Item.archive.ItemArchiveService {


    private final ItemRepository itemRepository;
    

    @Override
    public ItemArchiveResponse process(ItemArchiveRequest itemArchiveRequest) {
        Item item = itemRepository.findById(itemArchiveRequest.getItemId()).orElseThrow(() ->
                new IllegalArgumentException("Item with ID:" + itemArchiveRequest.getItemId() + "was not found"));
        item.setArchived(true);
        itemRepository.save(item);


        return ItemArchiveResponse.builder()
                .itemId(itemArchiveRequest.getItemId())
                .archived(item.getArchived()).
                build();
    }
}