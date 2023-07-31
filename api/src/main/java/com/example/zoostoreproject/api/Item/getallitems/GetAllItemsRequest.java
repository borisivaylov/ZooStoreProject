package com.example.zoostoreproject.api.Item.getallitems;

import com.example.zoostoreproject.api.base.OperationInput;
import com.example.zoostoreproject.persistence.entity.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllItemsRequest implements OperationInput {
    @JsonProperty("tagName")
    private String tagName;
}
