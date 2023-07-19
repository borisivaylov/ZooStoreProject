package com.example.zoostoreproject.API.Operations.Media.update;

import com.example.zoostoreproject.API.Operations.base.OperationResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MediaUpdateResponse implements OperationResult {
    @JsonProperty("id")
    private UUID Id;
    @JsonProperty("url")
    private String url;

    @JsonProperty("itemId")
    private UUID itemId;
}
