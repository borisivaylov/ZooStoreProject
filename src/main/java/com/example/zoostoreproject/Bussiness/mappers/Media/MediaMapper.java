package com.example.zoostoreproject.Bussiness.mappers.Media;

import com.example.zoostoreproject.Data.entity.Media;
import com.example.zoostoreproject.API.Operations.Media.MediaRequest;
import com.example.zoostoreproject.API.Operations.Media.MediaResponse;

public interface MediaMapper {

    Media mediaGet(MediaRequest getMedia);

    MediaResponse MediaPost(Media media);
}
