package com.example.zoostoreproject.Bussiness.operations.vendor.update;

import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.VendorResponse;
import com.example.zoostoreproject.Bussiness.Mappers.Vendor.VendorMapperImpl;
import com.example.zoostoreproject.Data.Entity.Vendor;
import com.example.zoostoreproject.Data.Repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service

public class VendorUpdateService {

    private VendorRepository vendorRepository;
    public VendorUpdateService(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public Vendor updateVendor(UUID id, String newVendorName){

        Vendor vendor = vendorRepository.findById(id).orElseThrow(()->
              new IllegalArgumentException("Vendor not found with ID: " + id))  ;
                vendor.setVendorName(newVendorName);

       // VendorRequest vendorRequest = VendorRequest.builder()
       //         .id(id).build();

       // Optional<Vendor> optionalVendor= vendorRepository.findById(vendorRequest.getId());

      //  Vendor vendor = optionalVendor.get();
      //  vendor.setVendorName(newVendorName);

        return vendorRepository.save(vendor);
    }
}
