package com.example.zoostoreproject.rest.Controller;

import com.example.zoostoreproject.API.Operations.Tag.create.CreateTagRequest;
import com.example.zoostoreproject.API.Operations.Tag.create.CreateTagResponse;
import com.example.zoostoreproject.API.Operations.Tag.update.UpdateTagRequest;
import com.example.zoostoreproject.API.Operations.Tag.update.UpdateTagResponse;
import com.example.zoostoreproject.core.operations.tag.create.TagCreateService;
import com.example.zoostoreproject.core.operations.tag.update.TagUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
@RequiredArgsConstructor
public class TagController
{
    private final TagCreateService tagCreateService;
    private final TagUpdateService tagUpdateService;

    @PostMapping("/newTag")
    CreateTagResponse newTag(@RequestBody CreateTagRequest createTagRequest) {
        return tagCreateService.process(createTagRequest) ;
    }
    @PutMapping("/updateTag")
    UpdateTagResponse updateVendor(@RequestBody UpdateTagRequest updateTagRequest){
        return tagUpdateService.process(updateTagRequest);
    }


}
