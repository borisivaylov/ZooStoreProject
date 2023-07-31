package com.example.zoostoreproject.rest.Controller;

import com.example.zoostoreproject.api.Vendor.create.CreateVendorRequest;
import com.example.zoostoreproject.api.Vendor.create.CreateVendorResponse;
import com.example.zoostoreproject.api.Vendor.update.UpdateVendorRequest;
import com.example.zoostoreproject.api.Vendor.update.UpdateVendorResponse;
import com.example.zoostoreproject.core.vendor.create.VendorCreateOperationProcessor;
import com.example.zoostoreproject.core.vendor.update.VendorUpdateOperationProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
@RequiredArgsConstructor
public class VendorController {


    private final VendorCreateOperationProcessor vendorCreateService;
    private final VendorUpdateOperationProcessor vendorUpdateService;

    @PostMapping("/addVendor")
    CreateVendorResponse newVendor(@RequestBody CreateVendorRequest createVendorRequest){
        return vendorCreateService.process(createVendorRequest);
    }
    @PutMapping ("/updateVendor")
    UpdateVendorResponse updateVendor(@RequestBody UpdateVendorRequest updateVendorRequest){
        return vendorUpdateService.process(updateVendorRequest);
    }

}
