package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Bussiness.operations.media.update.MediaUpdateService;
import com.example.zoostoreproject.Data.entity.Media;
import com.example.zoostoreproject.API.Operations.Media.MediaRequest;
import com.example.zoostoreproject.Data.repository.MediaRepository;
import com.example.zoostoreproject.Bussiness.operations.media.MediaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/media")
public class MediaController {

    private final MediaRepository mediaRepository;
    private final MediaServiceImpl mediaService;
    private final MediaUpdateService mediaUpdateService;
    public MediaController(MediaRepository mediaRepository, MediaServiceImpl mediaService, MediaUpdateService mediaUpdateService) {
        this.mediaRepository = mediaRepository;
        this.mediaService = mediaService;
        this.mediaUpdateService = mediaUpdateService;
    }
    @PostMapping("/addMedia")
    Media newMedia(@RequestBody MediaRequest mediaRequest){
        return mediaRepository.save(mediaService.createMedia(mediaRequest));
    }
    @PutMapping("/updateMedia")
    Media updateMedia(@RequestBody MediaRequest mediaRequest) {
        return mediaRepository.save(mediaUpdateService.updateMedia(mediaRequest));
    }

}
