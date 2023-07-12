package com.example.zoostoreproject.Bussiness.operations.tag.create;

import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.Bussiness.Mappers.Tag.TagMapperImpl;
import com.example.zoostoreproject.Data.Entity.Tag;
import com.example.zoostoreproject.Data.Repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagCreateService {
    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private TagMapperImpl tagMapper;

    public Tag newTag(TagRequest tag) {
        return tagRepository.save(tagMapper.TagGet(tag));
    }
}
