package com.example.zoostoreproject.Bussiness.operations.media;

import com.example.zoostoreproject.API.Operations.Media.MediaRequest;
import com.example.zoostoreproject.API.Operations.Media.MediaService;
import com.example.zoostoreproject.Data.Entity.Media;
import com.example.zoostoreproject.Bussiness.Mappers.Media.MediaMapperImpl;
import com.example.zoostoreproject.Data.Repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaRepository mediaRepository;
    @Autowired
    private MediaMapperImpl mediaMapper;

    public Media createMedia(MediaRequest mediaRequest){
        return mediaRepository.save(mediaMapper.mediaGet(mediaRequest));
    }
}
