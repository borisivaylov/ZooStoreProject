package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Media;
import com.example.zoostoreproject.Models.MediaRequest;
import com.example.zoostoreproject.Models.MediaResponse;
import org.springframework.stereotype.Component;

@Component
public class MediaMapperImpl implements MediaMapper{
    @Override
    public Media mediaGet(MediaRequest getMedia) {

        if ( getMedia == null) {
            return null;
        }
        return Media.builder()
                              .Id(getMedia.getId())
                              .url(getMedia.getUrl())
                              .itemId(getMedia.getItemId())
                              .build();
    }

    @Override
    public MediaResponse MediaPost(Media media) {

        if ( media == null) {
            return null;
        }
        return  MediaResponse.builder()
                                        .Id(media.getId())
                                        .url(media.getUrl())
                                        .itemId(media.getItemId())
                                        .build();

    }
}
