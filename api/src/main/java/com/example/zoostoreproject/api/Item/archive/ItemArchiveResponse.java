package com.example.zoostoreproject.api.Item.archive;


import com.example.zoostoreproject.api.base.OperationResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemArchiveResponse implements OperationResult {
    @JsonProperty("itemId")
    private UUID itemId;
    @JsonProperty("archived")
    private boolean archived;
}
