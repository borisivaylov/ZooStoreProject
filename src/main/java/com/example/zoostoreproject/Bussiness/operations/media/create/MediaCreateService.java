package com.example.zoostoreproject.Bussiness.operations.media.create;

import com.example.zoostoreproject.API.Operations.Media.MediaRequest;
import com.example.zoostoreproject.Bussiness.mappers.Media.MediaMapperImpl;
import com.example.zoostoreproject.Data.entity.Media;
import com.example.zoostoreproject.Data.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaCreateService
{

    private final MediaRepository mediaRepository;

    private final MediaMapperImpl mediaMapper;
    public Media createMedia(MediaRequest mediaRequest){
        return mediaRepository.save(mediaMapper.mediaGet(mediaRequest));
    }
}
