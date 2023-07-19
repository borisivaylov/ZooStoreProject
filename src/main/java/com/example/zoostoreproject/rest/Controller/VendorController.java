package com.example.zoostoreproject.rest.Controller;

import com.example.zoostoreproject.API.Operations.Tag.create.CreateTagResponse;
import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.create.CreateVendorResponse;
import com.example.zoostoreproject.API.Operations.Vendor.update.UpdateVendorRequest;
import com.example.zoostoreproject.API.Operations.Vendor.update.UpdateVendorResponse;
import com.example.zoostoreproject.core.operations.vendor.create.VendorCreateService;
import com.example.zoostoreproject.core.operations.vendor.update.VendorUpdateService;
import com.example.zoostoreproject.persistance.entity.Vendor;
import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.persistance.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
@RequiredArgsConstructor
public class VendorController {


    private final VendorCreateService vendorCreateService;
    private  final VendorUpdateService vendorUpdateService;

    @PostMapping("/addVendor")
    CreateVendorResponse newVendor(@RequestBody CreateVendorRequest createVendorRequest){
        return vendorCreateService.process(createVendorRequest);
    }
    @PutMapping ("/updateVendor")
    UpdateVendorResponse updateVendor(@RequestBody UpdateVendorRequest updateVendorRequest){
        return vendorUpdateService.process(updateVendorRequest);
    }

}
