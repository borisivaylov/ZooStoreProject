package com.example.zoostoreproject.core.operations.vendor.create;


import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorResponse;
import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorService;
import com.example.zoostoreproject.persistance.entity.Vendor;
import com.example.zoostoreproject.persistance.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendorCreateService implements CreateVendorService {

    private final VendorRepository vendorRepository;


    @Override
    public CreateVendorResponse process(CreateVendorRequest createVendorRequest) {

        Vendor vendor = Vendor.builder()
                .vendorName(createVendorRequest.getVendorName())
                .build();
        vendorRepository.save(vendor);

        return CreateVendorResponse.builder()
                .id(vendor.getId())
                .vendorName(vendor.getVendorName())
                .build();
    }
}
