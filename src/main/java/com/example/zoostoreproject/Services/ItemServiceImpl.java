package com.example.zoostoreproject.Services;

import com.example.zoostoreproject.Entity.Item;
import com.example.zoostoreproject.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
   // private final ItemRepository itemRepository;
    //private final Item item;

    public void createItem(@RequestBody Item item)
    {

    }

    public String okStatus(){

        return "Success!";
    }
}
