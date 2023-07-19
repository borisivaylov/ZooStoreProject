package com.example.zoostoreproject.core.operations.media.update;

import com.example.zoostoreproject.API.Operations.Media.update.MediaUpdateRequest;
import com.example.zoostoreproject.API.Operations.Media.update.MediaUpdateResponse;
import com.example.zoostoreproject.persistance.entity.Media;
import com.example.zoostoreproject.persistance.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaUpdateService implements com.example.zoostoreproject.API.Operations.Media.update.MediaUpdateService {

    public final MediaRepository mediaRepository;


    @Override
    public MediaUpdateResponse process(MediaUpdateRequest mediaUpdateRequest) {
        Media media = mediaRepository.findById(mediaUpdateRequest.getId()).orElseThrow(() ->
                new IllegalArgumentException("Media with ID:" + mediaUpdateRequest.getId() + "was not found"));
        media.setUrl(mediaUpdateRequest.getUrl());
        mediaRepository.save(media);

        return MediaUpdateResponse.builder()
                .Id(media.getId())
                .itemId(media.getItemId())
                .url(media.getUrl())
                .build();
    }
}
