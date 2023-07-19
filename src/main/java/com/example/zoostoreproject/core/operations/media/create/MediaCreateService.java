package com.example.zoostoreproject.core.operations.media.create;

import com.example.zoostoreproject.API.Operations.Media.create.MediaCreateRequest;
import com.example.zoostoreproject.API.Operations.Media.create.MediaCreateResponse;
import com.example.zoostoreproject.persistance.entity.Media;
import com.example.zoostoreproject.persistance.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaCreateService implements com.example.zoostoreproject.API.Operations.Media.create.MediaCreateService
{

    private final MediaRepository mediaRepository;

    @Override
    public MediaCreateResponse process(MediaCreateRequest mediaCreateRequest) {
        Media media = Media.builder()
                .itemId(mediaCreateRequest.getItemId())
                .url(mediaCreateRequest.getUrl())
                .build();

        mediaRepository.save(media);

        return MediaCreateResponse.builder()
                .Id(media.getId())
                .itemId(media.getItemId())
                .url(media.getUrl())
                .build();
    }
}
