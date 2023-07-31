package com.example.zoostoreproject.rest.Controller;


import com.example.zoostoreproject.api.Media.create.MediaCreateRequest;
import com.example.zoostoreproject.api.Media.create.MediaCreateResponse;
import com.example.zoostoreproject.api.Media.update.MediaUpdateRequest;
import com.example.zoostoreproject.api.Media.update.MediaUpdateResponse;
import com.example.zoostoreproject.core.media.create.MediaCreateOperationProcessor;
import com.example.zoostoreproject.core.media.update.MediaUpdateOperationProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/media")
@RequiredArgsConstructor
public class MediaController {


    private final MediaCreateOperationProcessor mediaCreateService;
    private final MediaUpdateOperationProcessor mediaUpdateService;

    @PostMapping("/addMedia")
    MediaCreateResponse newMedia(@RequestBody MediaCreateRequest mediaCreateRequest){
        return mediaCreateService.process(mediaCreateRequest);
    }
    @PutMapping("/updateMedia")
    MediaUpdateResponse updateMedia(@RequestBody MediaUpdateRequest mediaUpdateRequest) {
        return mediaUpdateService.process(mediaUpdateRequest);
    }

}
