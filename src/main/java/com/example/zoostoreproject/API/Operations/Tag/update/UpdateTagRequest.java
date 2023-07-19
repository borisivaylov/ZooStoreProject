package com.example.zoostoreproject.API.Operations.Tag.update;

import com.example.zoostoreproject.API.Operations.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTagRequest implements OperationInput {
    @JsonProperty("id")
    protected UUID Id;
    @JsonProperty("tagName")
    protected String tagName;
}
