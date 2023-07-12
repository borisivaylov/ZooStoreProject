package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Tag;
import com.example.zoostoreproject.Models.TagRequest;
import com.example.zoostoreproject.Models.TagResponse;
import org.springframework.stereotype.Component;

@Component
public class TagMapperImpl implements TagMapper{
    @Override
    public Tag TagGet(TagRequest tagRequest) {

        if ( tagRequest == null) {
            return null;
        }
        return Tag.builder()
                            .Id(tagRequest.getId())
                            .tagName(tagRequest.getTagName())
                            .build();
    }

    @Override
    public TagResponse TagPost(Tag tag) {

        if ( tag == null) {
            return null;
        }
        return TagResponse.builder()
                                    .Id(tag.getId())
                                    .tagName(tag.getTagName())
                                    .build();
    }
}
