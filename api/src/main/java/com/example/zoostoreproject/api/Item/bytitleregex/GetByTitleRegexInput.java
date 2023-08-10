package com.example.zoostoreproject.api.Item.bytitleregex;

import com.example.zoostoreproject.api.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetByTitleRegexInput implements OperationInput {

    @JsonProperty
    private String regex;
}
