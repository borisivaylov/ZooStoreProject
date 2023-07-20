package com.example.zoostoreproject.core.vendor.create;


import com.example.zoostoreproject.api.Vendor.create.CreateVendorRequest;
import com.example.zoostoreproject.api.Vendor.create.CreateVendorResponse;
import com.example.zoostoreproject.api.Vendor.create.CreateVendorService;
import com.example.zoostoreproject.persistence.entity.Vendor;
import com.example.zoostoreproject.persistence.repository.VendorRepository;
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
