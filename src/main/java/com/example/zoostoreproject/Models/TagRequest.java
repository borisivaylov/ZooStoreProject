package com.example.zoostoreproject.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagRequest {
    @JsonProperty("id")
    protected UUID Id;
    @JsonProperty("tagName")
    protected String tagName;
}
