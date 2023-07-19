package com.example.zoostoreproject.API.Operations.Item.attachTag;

import com.example.zoostoreproject.API.Operations.base.OperationResult;
import com.example.zoostoreproject.persistance.entity.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachTagResponse implements OperationResult {
    @JsonProperty("itemId")
    private UUID itemId;
    @JsonProperty("tagId")
    private Set<Tag> tags;
}
