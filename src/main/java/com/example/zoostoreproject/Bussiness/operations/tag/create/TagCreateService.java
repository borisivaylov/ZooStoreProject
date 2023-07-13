package com.example.zoostoreproject.Bussiness.operations.tag.create;

import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.Bussiness.mappers.Tag.TagMapperImpl;
import com.example.zoostoreproject.Data.entity.Tag;
import com.example.zoostoreproject.Data.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagCreateService {

    private final TagRepository tagRepository;


    private final TagMapperImpl tagMapper;

    public Tag newTag(TagRequest tag) {
        return tagRepository.save(tagMapper.TagGet(tag));
    }
}
