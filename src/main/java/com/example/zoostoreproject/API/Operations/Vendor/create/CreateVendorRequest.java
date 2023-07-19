package com.example.zoostoreproject.API.Operations.Vendor.create;

import com.example.zoostoreproject.API.Operations.base.OperationInput;
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
