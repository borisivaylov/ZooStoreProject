package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Item;
import com.example.zoostoreproject.Entity.Media;
import com.example.zoostoreproject.Entity.Tag;
import com.example.zoostoreproject.Entity.Vendor;
import com.example.zoostoreproject.Models.*;

@org.mapstruct.Mapper ( componentModel = "spring")
public interface Mapper
{
    ItemRequest itemGet(Item item);

    ItemResponse itemPost(Item item);

    MediaRequest mediaGet(Media media);

    MediaResponse MediaPost(Media media);

    TagRequest TagGet(Tag tag);

    TagResponse TagPost(Tag tag);

    VendorRequest VendorGet(Vendor vendor);

    VendorResponse VendorPost(Vendor vendor);

}
