package com.example.zoostoreproject.API.Operations.Item.attachMedia;

import com.example.zoostoreproject.API.Operations.base.OperationResult;
import com.example.zoostoreproject.persistance.entity.Media;
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
    @JsonProperty("mediaId")
    private Set<Media> mediaId;
}
