package com.example.zoostoreproject.Bussiness.mappers.Tag;

import com.example.zoostoreproject.Data.entity.Tag;
import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.API.Operations.Tag.TagResponse;
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
