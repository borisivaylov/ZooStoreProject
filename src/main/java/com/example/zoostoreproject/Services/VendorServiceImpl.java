package com.example.zoostoreproject.Services;

import com.example.zoostoreproject.Entity.Vendor;
import com.example.zoostoreproject.Mappers.VendorMapperImpl;
import com.example.zoostoreproject.Models.VendorRequest;
import com.example.zoostoreproject.Repository.VendorRepository;
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
