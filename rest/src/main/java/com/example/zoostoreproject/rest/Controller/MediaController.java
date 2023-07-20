package com.example.zoostoreproject.rest.Controller;


import com.example.zoostoreproject.api.Media.create.MediaCreateRequest;
import com.example.zoostoreproject.api.Media.create.MediaCreateResponse;
import com.example.zoostoreproject.api.Media.update.MediaUpdateRequest;
import com.example.zoostoreproject.api.Media.update.MediaUpdateResponse;
import com.example.zoostoreproject.core.media.create.MediaCreateService;
import com.example.zoostoreproject.core.media.update.MediaUpdateService;
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
