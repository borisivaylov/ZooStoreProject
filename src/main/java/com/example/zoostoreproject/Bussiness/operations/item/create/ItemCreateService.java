package com.example.zoostoreproject.Bussiness.operations.item.create;

import com.example.zoostoreproject.API.Operations.Item.ItemRequest;
import com.example.zoostoreproject.API.Operations.Item.ItemService;
import com.example.zoostoreproject.Bussiness.Mappers.Item.ItemMapperImpl;
import com.example.zoostoreproject.Data.Entity.Item;
import com.example.zoostoreproject.Data.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemCreateService implements ItemService
{
    @Autowired
    private final ItemRepository itemRepository;
    @Autowired
    private final ItemMapperImpl itemMapper;

    public Item createItem(ItemRequest itemRequest) {
        return itemRepository.save(itemMapper.itemGet(itemRequest));
    }
}
