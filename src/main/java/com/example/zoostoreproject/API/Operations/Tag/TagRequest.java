package com.example.zoostoreproject.API.Operations.Tag;

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
