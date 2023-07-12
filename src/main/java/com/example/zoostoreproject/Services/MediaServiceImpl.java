package com.example.zoostoreproject.Services;

import com.example.zoostoreproject.Entity.Media;
import com.example.zoostoreproject.Mappers.MediaMapperImpl;
import com.example.zoostoreproject.Models.MediaRequest;
import com.example.zoostoreproject.Repository.MediaRepository;
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
