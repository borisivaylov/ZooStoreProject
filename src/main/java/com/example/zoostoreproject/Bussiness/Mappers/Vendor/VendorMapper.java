package com.example.zoostoreproject.Bussiness.Mappers.Vendor;

import com.example.zoostoreproject.Data.Entity.Vendor;
import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.VendorResponse;

public interface VendorMapper {
    Vendor VendorGet(VendorRequest vendor);

    VendorResponse VendorPost(Vendor vendor);

}
