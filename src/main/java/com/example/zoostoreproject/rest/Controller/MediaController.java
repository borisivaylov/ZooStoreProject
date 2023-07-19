package com.example.zoostoreproject.rest.Controller;

import com.example.zoostoreproject.API.Operations.Media.create.MediaCreateRequest;
import com.example.zoostoreproject.API.Operations.Media.create.MediaCreateResponse;
import com.example.zoostoreproject.API.Operations.Media.update.MediaUpdateRequest;
import com.example.zoostoreproject.API.Operations.Media.update.MediaUpdateResponse;
import com.example.zoostoreproject.core.operations.media.create.MediaCreateService;
import com.example.zoostoreproject.core.operations.media.update.MediaUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/media")
@RequiredArgsConstructor
public class MediaController {


    private final MediaCreateService mediaCreateService;
    private final MediaUpdateService mediaUpdateService;

    @PostMapping("/addMedia")
    MediaCreateResponse newMedia(@RequestBody MediaCreateRequest mediaCreateRequest){
        return mediaCreateService.process(mediaCreateRequest);
    }
    @PutMapping("/updateMedia")
    MediaUpdateResponse updateMedia(@RequestBody MediaUpdateRequest mediaUpdateRequest) {
        return mediaUpdateService.process(mediaUpdateRequest);
    }

}
