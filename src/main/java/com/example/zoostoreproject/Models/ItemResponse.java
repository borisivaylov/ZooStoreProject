package com.example.zoostoreproject.Models;

import com.example.zoostoreproject.Entity.Media;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor (access = AccessLevel.PUBLIC)
public class ItemResponse {

    @JsonProperty("id")
    private UUID id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("vendor")
    private String vendor;
    //@JsonProperty("media")
    //private Set<Media> media;
   // @JsonProperty("tags")
   // private Set<Tag> tags;
}

