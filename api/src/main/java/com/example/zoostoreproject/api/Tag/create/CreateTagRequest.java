package com.example.zoostoreproject.api.Tag.create;


import com.example.zoostoreproject.api.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTagRequest implements OperationInput {
    @JsonProperty("tagName")
    protected String tagName;
}
