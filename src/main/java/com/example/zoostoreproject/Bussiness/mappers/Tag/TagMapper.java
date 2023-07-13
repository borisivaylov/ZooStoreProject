package com.example.zoostoreproject.Bussiness.mappers.Tag;

import com.example.zoostoreproject.Data.entity.Tag;
import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.API.Operations.Tag.TagResponse;

public interface TagMapper {
    Tag TagGet(TagRequest tag);

    TagResponse TagPost(Tag tag);
}
