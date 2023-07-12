package com.example.zoostoreproject.Bussiness.Mappers.Media;

import com.example.zoostoreproject.Data.Entity.Media;
import com.example.zoostoreproject.API.Operations.Media.MediaRequest;
import com.example.zoostoreproject.API.Operations.Media.MediaResponse;

public interface MediaMapper {

    Media mediaGet(MediaRequest getMedia);

    MediaResponse MediaPost(Media media);
}
