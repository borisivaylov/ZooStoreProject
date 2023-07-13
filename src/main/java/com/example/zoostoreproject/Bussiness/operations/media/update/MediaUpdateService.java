package com.example.zoostoreproject.Bussiness.operations.media.update;

import com.example.zoostoreproject.API.Operations.Media.MediaRequest;
import com.example.zoostoreproject.Data.entity.Media;
import com.example.zoostoreproject.Data.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaUpdateService {

    public final MediaRepository mediaRepository;

    public Media updateMedia (MediaRequest mediaRequest) {
        Media media = mediaRepository.findById(mediaRequest.getId()).orElseThrow(() ->
                new IllegalArgumentException("Media with ID:" + mediaRequest.getId() + "was not found"));
                media.setUrl(mediaRequest.getUrl());
                return mediaRepository.save(media);
    }
}
