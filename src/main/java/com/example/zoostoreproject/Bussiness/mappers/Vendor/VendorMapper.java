package com.example.zoostoreproject.Bussiness.mappers.Vendor;

import com.example.zoostoreproject.Data.entity.Vendor;
import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.VendorResponse;

public interface VendorMapper {
    Vendor VendorGet(VendorRequest vendor);

    VendorResponse VendorPost(Vendor vendor);

}
