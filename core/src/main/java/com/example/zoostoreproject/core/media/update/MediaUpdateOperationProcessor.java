package com.example.zoostoreproject.core.media.update;


import com.example.zoostoreproject.api.Media.update.MediaUpdateOperation;
import com.example.zoostoreproject.api.Media.update.MediaUpdateRequest;
import com.example.zoostoreproject.api.Media.update.MediaUpdateResponse;
import com.example.zoostoreproject.persistence.entity.Media;
import com.example.zoostoreproject.persistence.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaUpdateOperationProcessor implements MediaUpdateOperation {

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
