package com.example.zoostoreproject.Bussiness.Mappers.Item;

import com.example.zoostoreproject.Data.Entity.Item;
import com.example.zoostoreproject.API.Operations.Item.ItemRequest;
import com.example.zoostoreproject.API.Operations.Item.ItemResponse;

public interface ItemMapper {
    Item itemGet(ItemRequest itemGet);

    ItemResponse itemPost(Item item);
}
