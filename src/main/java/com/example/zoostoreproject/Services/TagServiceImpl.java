package com.example.zoostoreproject.Services;

import com.example.zoostoreproject.Entity.Tag;
import com.example.zoostoreproject.Mappers.TagMapper;
import com.example.zoostoreproject.Mappers.TagMapperImpl;
import com.example.zoostoreproject.Models.TagRequest;
import com.example.zoostoreproject.Models.TagResponse;
import com.example.zoostoreproject.Repository.TagRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
