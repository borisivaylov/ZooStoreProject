package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Tag;
import com.example.zoostoreproject.Models.TagRequest;
import com.example.zoostoreproject.Models.TagResponse;

public class TagMapperImpl implements TagMapper{
    @Override
    public Tag TagGet(TagRequest tagRequest) {

        if ( tagRequest == null) {
            return null;
        }
        Tag tag = new Tag();

        tag.setId(tagRequest.getId());
        tag.setTagName(tagRequest.getTagName());

        return tag;

    }

    @Override
    public TagResponse TagPost(Tag tag) {

        if ( tag == null) {
            return null;
        }

        TagResponse tagResponse = new TagResponse();

        tagResponse.setId(tag.getId());
        tagResponse.setTagName(tag.getTagName());

        return tagResponse;
    }
}
