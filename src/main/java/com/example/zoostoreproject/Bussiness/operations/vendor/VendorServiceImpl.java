package com.example.zoostoreproject.Bussiness.operations.vendor;

import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.VendorService;
import com.example.zoostoreproject.Data.entity.Vendor;
import com.example.zoostoreproject.Bussiness.mappers.Vendor.VendorMapperImpl;
import com.example.zoostoreproject.Data.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService
{
    @Autowired
    private VendorRepository vendorRepository;
    @Autowired
    private VendorMapperImpl vendorMapper;

    public Vendor newVendor(VendorRequest vendorRequest){
        return vendorRepository.save(vendorMapper.VendorGet(vendorRequest));
    }

    public String Success()
    {
        return "Success!";
    }

}
