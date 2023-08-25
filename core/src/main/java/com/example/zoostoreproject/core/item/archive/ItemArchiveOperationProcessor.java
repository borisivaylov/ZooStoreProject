package com.example.zoostoreproject.core.item.archive;


import com.example.zoostoreproject.api.Item.archive.ItemArchiveOperation;
import com.example.zoostoreproject.api.Item.archive.ItemArchiveRequest;
import com.example.zoostoreproject.api.Item.archive.ItemArchiveResponse;
import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

    //Archives an item, marking it as not sellable anymore.


@Service
@RequiredArgsConstructor
public class ItemArchiveOperationProcessor implements ItemArchiveOperation {

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