package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Data.Entity.Tag;
import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.Data.Repository.TagRepository;
import com.example.zoostoreproject.Bussiness.operations.tag.TagServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
public class TagController
{
    private final TagRepository tagRepository;

    private final TagServiceImpl tagService;

    TagController (TagRepository repository, TagServiceImpl tagService)
    {
        this.tagRepository = repository;
        this.tagService = tagService;
    }

    @PostMapping("/newtag")
    Tag newTag(@RequestBody TagRequest tag) {
        return tagRepository.save(tagService.newTag(tag));
    }

}
