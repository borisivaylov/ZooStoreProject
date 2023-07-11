package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Tag;
import com.example.zoostoreproject.Models.TagRequest;
import com.example.zoostoreproject.Models.TagResponse;

public interface TagMapper {
    Tag TagGet(TagRequest tag);

    TagResponse TagPost(Tag tag);
}
