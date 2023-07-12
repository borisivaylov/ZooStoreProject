package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Entity.Media;
import com.example.zoostoreproject.Models.MediaRequest;
import com.example.zoostoreproject.Repository.MediaRepository;
import com.example.zoostoreproject.Services.MediaServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/media")
public class MediaController {

    private final MediaRepository mediaRepository;
    private final MediaServiceImpl mediaService;
    public MediaController(MediaRepository mediaRepository, MediaServiceImpl mediaService) {
        this.mediaRepository = mediaRepository;
        this.mediaService = mediaService;
    }
    @PostMapping("/addMedia")
    Media newMedia(@RequestBody MediaRequest mediaRequest){
        return mediaRepository.save(mediaService.createMedia(mediaRequest));
    }

}
