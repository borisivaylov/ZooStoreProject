package com.example.zoostoreproject.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor (access = AccessLevel.PROTECTED)
public class MediaPostDTO {

    @JsonProperty("id")
    protected Long Id;
    @JsonProperty("url")
    protected String url;
}
