package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Bussiness.operations.tag.update.TagUpdateService;
import com.example.zoostoreproject.Data.entity.Tag;
import com.example.zoostoreproject.API.Operations.Tag.TagRequest;
import com.example.zoostoreproject.Data.repository.TagRepository;
import com.example.zoostoreproject.Bussiness.operations.tag.TagServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController
{
    private final TagRepository tagRepository;
    private final TagServiceImpl tagService;
    private final TagUpdateService tagUpdateService;

    TagController (TagRepository repository, TagServiceImpl tagService, TagUpdateService tagUpdateService)
    {
        this.tagRepository = repository;
        this.tagService = tagService;
        this.tagUpdateService = tagUpdateService;
    }

    @PostMapping("/newTag")
    Tag newTag(@RequestBody TagRequest tag) {
        return tagRepository.save(tagService.newTag(tag));
    }
    @PutMapping("/updateTag")
    Tag updateVendor(@RequestBody TagRequest tagRequest){
        return tagRepository.save(tagUpdateService.updateTag(tagRequest));
    }


}
