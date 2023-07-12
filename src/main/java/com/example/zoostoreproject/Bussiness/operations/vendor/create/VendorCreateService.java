package com.example.zoostoreproject.Bussiness.operations.vendor.create;

import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.Bussiness.Mappers.Vendor.VendorMapperImpl;
import com.example.zoostoreproject.Data.Entity.Vendor;
import com.example.zoostoreproject.Data.Repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendorCreateService {
    @Autowired
    private VendorRepository vendorRepository;
    @Autowired
    private VendorMapperImpl vendorMapper;

    public Vendor newVendor(VendorRequest vendorRequest){
        return vendorRepository.save(vendorMapper.VendorGet(vendorRequest));
    }
}
