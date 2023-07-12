package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Item;
import com.example.zoostoreproject.Models.ItemRequest;
import com.example.zoostoreproject.Models.ItemResponse;
import org.springframework.stereotype.Component;

@Component
public class ItemMapperImpl implements ItemMapper {
    @Override
    public Item itemGet(ItemRequest itemGet) {      //dto to item

        if ( itemGet == null) {
            return null;
        }
        return Item.builder()
                            .Id(itemGet.getId())
                            .title(itemGet.getTitle())
                            .vendor(itemGet.getVendor())
                            .description(itemGet.getDescription())
                            .build();
    }

    @Override
    public ItemResponse itemPost(Item item) {          // item to dto
        if ( item == null) {
            return null;
        }
        return ItemResponse.builder()
                                    .id(item.getId())
                                    .vendor(item.getVendor())
                                    .description(item.getDescription())
                                    .title(item.getTitle())
                                    .build();
    }
}
