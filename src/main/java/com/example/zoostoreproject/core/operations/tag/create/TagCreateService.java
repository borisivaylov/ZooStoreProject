package com.example.zoostoreproject.core.operations.tag.create;

import com.example.zoostoreproject.API.Operations.Tag.create.CreateTagRequest;
import com.example.zoostoreproject.API.Operations.Tag.create.CreateTagResponse;
import com.example.zoostoreproject.API.Operations.Tag.create.CreateTagService;
import com.example.zoostoreproject.persistance.entity.Tag;
import com.example.zoostoreproject.persistance.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagCreateService implements CreateTagService {

    private final TagRepository tagRepository;

    @Override
    public CreateTagResponse process(CreateTagRequest createTagRequest) {

        Tag tag = Tag.builder()
                .tagName(createTagRequest.getTagName())
                .build();
        tagRepository.save(tag);
        return CreateTagResponse.builder()
                .Id(tag.getId())
                .tagName(tag.getTagName())
                .build();
    }
}
