package com.example.zoostoreproject.Bussiness.operations.tag.update;

import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.Data.entity.Tag;
import com.example.zoostoreproject.Data.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagUpdateService {

    public final TagRepository tagRepository;

    public Tag updateTag(TagRequest tagRequest){
        Tag tag = tagRepository.findById(tagRequest.getId()).orElseThrow(()->
                new IllegalArgumentException("Tag with ID:" + tagRequest.getId() + "was not found"));
                tag.setTagName(tagRequest.getTagName());
        return tagRepository.save(tag);
    }

}


