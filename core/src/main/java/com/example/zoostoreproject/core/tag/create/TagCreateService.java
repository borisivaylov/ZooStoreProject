package com.example.zoostoreproject.core.tag.create;


import com.example.zoostoreproject.api.Tag.create.CreateTagRequest;
import com.example.zoostoreproject.api.Tag.create.CreateTagResponse;
import com.example.zoostoreproject.api.Tag.create.CreateTagService;
import com.example.zoostoreproject.persistence.entity.Tag;
import com.example.zoostoreproject.persistence.repository.TagRepository;
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
