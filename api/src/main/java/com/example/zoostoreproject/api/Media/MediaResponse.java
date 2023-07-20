package com.example.zoostoreproject.api.Media;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MediaResponse {

    @JsonProperty("id")
    protected UUID Id;
    @JsonProperty("url")
    protected String url;

    @JsonProperty("id")
    protected UUID itemId;
}
