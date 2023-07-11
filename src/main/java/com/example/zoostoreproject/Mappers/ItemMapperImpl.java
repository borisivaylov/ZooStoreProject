package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Item;
import com.example.zoostoreproject.Models.ItemRequest;
import com.example.zoostoreproject.Models.ItemResponse;
import org.mapstruct.Mapper;

@Mapper
public class ItemMapperImpl implements ItemMapper {
    @Override
    public Item itemGet(ItemRequest itemGet) {      //dto to item

        if ( itemGet == null) {
            return null;
        }
        Item item = new Item();

        item.setId(itemGet.getId());
        item.setTitle(itemGet.getTitle());
        item.setVendor(itemGet.getVendor());
        item.setDescription(itemGet.getDescription());

        return item;


    }

    @Override
    public ItemResponse itemPost(Item item) {          // item to dto
        if ( item == null) {
            return null;
        }
        ItemResponse itemResponse = new ItemResponse();

        itemResponse.setId(item.getId());
        itemResponse.setTitle(item.getTitle());
        itemResponse.setDescription(item.getDescription());
        itemResponse.setVendor(item.getVendor());

        return itemResponse;
    }
}
