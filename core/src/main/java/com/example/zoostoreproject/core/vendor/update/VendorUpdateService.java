package com.example.zoostoreproject.core.vendor.update;


import com.example.zoostoreproject.api.Vendor.update.UpdateVendorRequest;
import com.example.zoostoreproject.api.Vendor.update.UpdateVendorResponse;
import com.example.zoostoreproject.api.Vendor.update.UpdateVendorService;
import com.example.zoostoreproject.persistence.entity.Vendor;
import com.example.zoostoreproject.persistence.repository.VendorRepository;
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
