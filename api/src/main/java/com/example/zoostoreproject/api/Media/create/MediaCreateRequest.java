package com.example.zoostoreproject.api.Media.create;


import com.example.zoostoreproject.api.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MediaCreateRequest implements OperationInput {
    @JsonProperty("url")
    protected String url;
    @JsonProperty("itemId")
    protected UUID itemId;
}
