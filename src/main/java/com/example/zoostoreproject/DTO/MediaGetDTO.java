package com.example.zoostoreproject.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MediaGetDTO {
    @JsonProperty("id")
    protected Long Id;
    @JsonProperty("url")
    protected String url;
}
