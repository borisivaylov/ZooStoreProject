package com.example.zoostoreproject.Bussiness.operations.vendor.update;

import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.Data.entity.Vendor;
import com.example.zoostoreproject.Data.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendorUpdateService {

    private final VendorRepository vendorRepository;


    public Vendor updateVendor(VendorRequest vendorRequest){

        Vendor vendor = vendorRepository.findById(vendorRequest.getId()).orElseThrow(()->
              new IllegalArgumentException("Vendor not found with ID: " + vendorRequest.getId()))  ;
                vendor.setVendorName(vendorRequest.getVendorName());

       // VendorRequest vendorRequest = VendorRequest.builder()
       //         .id(id).build();

       // Optional<Vendor> optionalVendor= vendorRepository.findById(vendorRequest.getId());

      //  Vendor vendor = optionalVendor.get();
      //  vendor.setVendorName(newVendorName);

        return vendorRepository.save(vendor);
    }
}
