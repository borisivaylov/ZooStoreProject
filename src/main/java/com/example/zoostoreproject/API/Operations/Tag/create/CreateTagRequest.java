package com.example.zoostoreproject.API.Operations.Tag.create;

import com.example.zoostoreproject.API.Operations.base.OperationInput;
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
