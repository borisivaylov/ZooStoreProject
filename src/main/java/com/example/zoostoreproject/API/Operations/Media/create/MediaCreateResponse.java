package com.example.zoostoreproject.API.Operations.Media.create;

import com.example.zoostoreproject.API.Operations.base.OperationResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MediaCreateResponse implements OperationResult {
    @JsonProperty("id")
    private UUID Id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("itemId")
    private UUID itemId;
}
