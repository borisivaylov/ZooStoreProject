package com.example.zoostoreproject.API.Operations.Item.update;

import com.example.zoostoreproject.API.Operations.base.OperationResult;
import com.example.zoostoreproject.persistance.entity.Media;
import com.example.zoostoreproject.persistance.entity.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateItemResponse implements OperationResult {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("vendor")
    private UUID vendor;
    @JsonProperty("media")
    private Set<Media> media;
    @JsonProperty("tags")
    private Set<Tag> tags;
    @JsonProperty("archive")
    private boolean archive;
}
