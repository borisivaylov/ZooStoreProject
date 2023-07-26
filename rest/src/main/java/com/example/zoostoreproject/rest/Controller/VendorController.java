package com.example.zoostoreproject.rest.Controller;

import com.example.zoostoreproject.api.Vendor.create.CreateVendorRequest;
import com.example.zoostoreproject.api.Vendor.create.CreateVendorResponse;
import com.example.zoostoreproject.api.Vendor.update.UpdateVendorRequest;
import com.example.zoostoreproject.api.Vendor.update.UpdateVendorResponse;
import com.example.zoostoreproject.core.vendor.create.VendorCreateService;
import com.example.zoostoreproject.core.vendor.update.VendorUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
@RequiredArgsConstructor
public class VendorController {


    private final VendorCreateService vendorCreateService;
    private final VendorUpdateService vendorUpdateService;

    @PostMapping("/addVendor")
    CreateVendorResponse newVendor(@RequestBody CreateVendorRequest createVendorRequest){
        return vendorCreateService.process(createVendorRequest);
    }
    @PutMapping ("/updateVendor")
    UpdateVendorResponse updateVendor(@RequestBody UpdateVendorRequest updateVendorRequest){
        return vendorUpdateService.process(updateVendorRequest);
    }

}
