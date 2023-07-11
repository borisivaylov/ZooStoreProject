package com.example.zoostoreproject.Mappers;


import com.example.zoostoreproject.Entity.Vendor;
import com.example.zoostoreproject.Models.VendorRequest;
import com.example.zoostoreproject.Models.VendorResponse;

public class VendorMapperImpl implements VendorMapper {


    @Override
    public Vendor VendorGet(VendorRequest vendorGet) {

        if (vendorGet == null) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setId(vendorGet.getId());
        vendor.setVendorName(vendor.getVendorName());

        return vendor;
    }

    @Override
    public VendorResponse VendorPost(Vendor vendor) {
        if (vendor == null) {
            return null;
        }
         VendorResponse vendorResponse = new VendorResponse();

        vendorResponse.setId(vendor.getId());
        vendorResponse.setTitle(vendor.getVendorName());

        return vendorResponse;

    }
}
