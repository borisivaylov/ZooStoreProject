package com.example.zoostoreproject.Bussiness.operations.item.create;

import com.example.zoostoreproject.API.Operations.Item.ItemRequest;
import com.example.zoostoreproject.API.Operations.Item.ItemService;
import com.example.zoostoreproject.Bussiness.mappers.Item.ItemMapperImpl;
import com.example.zoostoreproject.Data.entity.Item;
import com.example.zoostoreproject.Data.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemCreateService implements ItemService
{

    private final ItemRepository itemRepository;

    private final ItemMapperImpl itemMapper;

    public Item createItem(ItemRequest itemRequest) {
        return itemRepository.save(itemMapper.itemGet(itemRequest));
    }
}
