package com.example.zoostoreproject.Bussiness.operations.tag;

import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.API.Operations.Tag.TagService;
import com.example.zoostoreproject.Data.entity.Tag;
import com.example.zoostoreproject.Bussiness.mappers.Tag.TagMapperImpl;
import com.example.zoostoreproject.Data.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService
{
    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private TagMapperImpl tagMapper;

    public Tag newTag(TagRequest tag) {
        return tagRepository.save(tagMapper.TagGet(tag));
    }

}
