package com.example.zoostoreproject.core.operations.vendor.update;

import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorResponse;
import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorService;
import com.example.zoostoreproject.API.Operations.Vendor.update.UpdateVendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.update.UpdateVendorResponse;
import com.example.zoostoreproject.API.Operations.Vendor.update.UpdateVendorService;
import com.example.zoostoreproject.persistance.entity.Vendor;
import com.example.zoostoreproject.persistance.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendorUpdateService implements UpdateVendorService {

    private final VendorRepository vendorRepository;

    @Override
    public UpdateVendorResponse process(UpdateVendorRequest updateVendorRequest) {

        Vendor vendor = vendorRepository.findById(updateVendorRequest.getId()).orElseThrow(()->
                new IllegalArgumentException("Vendor not found with ID: " + updateVendorRequest.getId()))  ;
        vendor.setVendorName(updateVendorRequest.getVendorName());

        vendorRepository.save(vendor);

        return UpdateVendorResponse.builder()
                .id(vendor.getId())
                .vendorName(vendor.getVendorName())
                .build();
    }
}
