package com.example.zoostoreproject.Bussiness.Mappers.Tag;

import com.example.zoostoreproject.Data.Entity.Tag;
import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.API.Operations.Tag.TagResponse;

public interface TagMapper {
    Tag TagGet(TagRequest tag);

    TagResponse TagPost(Tag tag);
}
