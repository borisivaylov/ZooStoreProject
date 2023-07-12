package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Entity.Tag;
import com.example.zoostoreproject.Models.TagRequest;
import com.example.zoostoreproject.Repository.TagRepository;
import com.example.zoostoreproject.Services.TagServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
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
    Tag newTag(@RequestBody TagRequest tag)
    {
        return tagRepository.save(tagService.newTag(tag));
    }

}
