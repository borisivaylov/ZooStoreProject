package com.example.zoostoreproject.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor (access = AccessLevel.PROTECTED)
public class MediaResponse {

    @JsonProperty("id")
    protected Long Id;
    @JsonProperty("url")
    protected String url;
}
