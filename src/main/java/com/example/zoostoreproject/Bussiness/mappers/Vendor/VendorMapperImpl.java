package com.example.zoostoreproject.Bussiness.mappers.Vendor;


import com.example.zoostoreproject.Data.entity.Vendor;
import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.VendorResponse;
import org.springframework.stereotype.Component;

@Component
public class VendorMapperImpl implements VendorMapper {


    @Override
    public Vendor VendorGet(VendorRequest vendorGet) {

        if (vendorGet == null) {
            return null;
        }
        return Vendor.builder()
                .Id(vendorGet.getId())
                .vendorName(vendorGet.getVendorName())
                .build();
    }

    @Override
    public VendorResponse VendorPost(Vendor vendor) {
        if (vendor == null) {
            return null;
        }
        return VendorResponse.builder()
                                        .id(vendor.getId())
                                        .vendorName(vendor.getVendorName())
                                        .build();

    }
}
