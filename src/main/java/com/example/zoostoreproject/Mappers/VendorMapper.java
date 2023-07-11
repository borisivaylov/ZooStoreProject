package com.example.zoostoreproject.Mappers;

import com.example.zoostoreproject.Entity.Vendor;
import com.example.zoostoreproject.Models.VendorRequest;
import com.example.zoostoreproject.Models.VendorResponse;

public interface VendorMapper {
    Vendor VendorGet(VendorRequest vendor);

    VendorResponse VendorPost(Vendor vendor);

}
