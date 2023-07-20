package com.example.zoostoreproject.api.Item.attachMedia;


import com.example.zoostoreproject.api.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachMediaRequest implements OperationInput {
    @JsonProperty("itemId")
    private UUID itemId;
    @JsonProperty("mediaId")
    private UUID mediaId;
}
