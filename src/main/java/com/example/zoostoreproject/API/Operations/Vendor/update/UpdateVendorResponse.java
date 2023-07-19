package com.example.zoostoreproject.API.Operations.Vendor.update;

import com.example.zoostoreproject.API.Operations.base.OperationResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateVendorResponse implements OperationResult  {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("vendorName")
    private String vendorName;
}
