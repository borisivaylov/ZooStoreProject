package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Media;
import com.example.zoostoreproject.Models.MediaRequest;
import com.example.zoostoreproject.Models.MediaResponse;

public interface MediaMapper {

    Media mediaGet(MediaRequest getMedia);

    MediaResponse MediaPost(Media media);
}
