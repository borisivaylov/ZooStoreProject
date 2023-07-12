package com.example.zoostoreproject.API.Operations.Vendor;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendorRequest
{
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("vendorName")
    private String vendorName;
}
