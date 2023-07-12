package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Item;
import com.example.zoostoreproject.Models.ItemRequest;
import com.example.zoostoreproject.Models.ItemResponse;

public interface ItemMapper {
    Item itemGet(ItemRequest itemGet);

    ItemResponse itemPost(Item item);
}
