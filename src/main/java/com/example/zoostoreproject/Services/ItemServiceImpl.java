package com.example.zoostoreproject.Services;

import com.example.zoostoreproject.Entity.Item;
import com.example.zoostoreproject.Mappers.ItemMapperImpl;
import com.example.zoostoreproject.Models.ItemRequest;
import com.example.zoostoreproject.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemMapperImpl itemMapper;
    public Item createItem(ItemRequest itemRequest) {
        return itemRepository.save(itemMapper.itemGet(itemRequest));
    }

    public String okStatus(){

        return "Success!";
    }
}
