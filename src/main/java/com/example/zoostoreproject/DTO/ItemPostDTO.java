package com.example.zoostoreproject.DTO;

import com.example.zoostoreproject.Entity.Media;
import com.example.zoostoreproject.Entity.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Set;

@Getter
@Setter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor (access = AccessLevel.PROTECTED)
public class ItemPostDTO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("media")
    private Set<Media> media;
    @JsonProperty("tags")
    private Set<Tag> tags;
}

