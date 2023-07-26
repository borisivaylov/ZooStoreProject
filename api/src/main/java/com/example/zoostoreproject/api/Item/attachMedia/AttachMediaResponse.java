package com.example.zoostoreproject.api.Item.attachMedia;



import com.example.zoostoreproject.api.base.OperationResult;

import com.example.zoostoreproject.persistence.entity.Media;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachMediaResponse implements OperationResult {
    @JsonProperty("itemId")
    private UUID itemId;
    @JsonProperty("media")
    private Set<Media> media;
}
