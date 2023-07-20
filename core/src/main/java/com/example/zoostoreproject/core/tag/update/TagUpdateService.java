package com.example.zoostoreproject.core.tag.update;


import com.example.zoostoreproject.api.Tag.update.UpdateTagRequest;
import com.example.zoostoreproject.api.Tag.update.UpdateTagResponse;
import com.example.zoostoreproject.api.Tag.update.UpdateTagService;
import com.example.zoostoreproject.persistence.entity.Tag;
import com.example.zoostoreproject.persistence.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagUpdateService implements UpdateTagService {

    public final TagRepository tagRepository;

    @Override
    public UpdateTagResponse process(UpdateTagRequest updateTagRequest) {

        Tag tag = tagRepository.findById(updateTagRequest.getId()).orElseThrow(()->
                new IllegalArgumentException("Tag with ID:" + updateTagRequest.getId() + "was not found"));
        tag.setTagName(updateTagRequest.getTagName());
        tagRepository.save(tag);

        return UpdateTagResponse.builder()
                .Id(tag.getId())
                .tagName(tag.getTagName())
                .build();
    }
}


