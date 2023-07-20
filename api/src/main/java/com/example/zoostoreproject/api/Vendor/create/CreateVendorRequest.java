package com.example.zoostoreproject.api.Vendor.create;


import com.example.zoostoreproject.api.base.OperationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateVendorRequest implements OperationInput {
    @JsonProperty("vendorName")
    private String vendorName;
}
