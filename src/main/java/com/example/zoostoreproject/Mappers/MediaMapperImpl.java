package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Media;
import com.example.zoostoreproject.Models.MediaRequest;
import com.example.zoostoreproject.Models.MediaResponse;

public class MediaMapperImpl implements MediaMapper{
    @Override
    public Media mediaGet(MediaRequest getMedia) {

        if ( getMedia == null) {
            return null;
        }
        Media media = new Media();

        media.setId(getMedia.getId());
        media.setUrl(getMedia.getUrl());
        media.setItemId(getMedia.getItemId());

        return media;
    }

    @Override
    public MediaResponse MediaPost(Media media) {

        if ( media == null) {
            return null;
        }
        MediaResponse mediaResponse = new MediaResponse();

        mediaResponse.setId(media.getId());
        mediaResponse.setUrl(media.getUrl());
        mediaResponse.setItemId(media.getItemId());

        return  mediaResponse;

    }
}
