package com.example.zoostoreproject.API.Operations.Item.archive;

import com.example.zoostoreproject.API.Operations.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemArchiveRequest implements OperationInput {
    @JsonProperty("itemId")
    private UUID itemId;
}
