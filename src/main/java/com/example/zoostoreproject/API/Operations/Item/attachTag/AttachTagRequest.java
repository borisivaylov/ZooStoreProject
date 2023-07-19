package com.example.zoostoreproject.API.Operations.Item.attachTag;

import com.example.zoostoreproject.API.Operations.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachTagRequest implements OperationInput {
    @JsonProperty("itemId")
    private UUID itemId;
    @JsonProperty("tagId")
    private UUID tagId;
}
