package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Data.Entity.Vendor;
import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.Data.Repository.VendorRepository;
import com.example.zoostoreproject.Bussiness.operations.vendor.VendorServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VendorController {


    private final VendorRepository vendorRepository;
    VendorServiceImpl vendorService;

    public VendorController(VendorRepository vendorRepository, VendorServiceImpl vendorService) {
        this.vendorRepository = vendorRepository;
        this.vendorService = vendorService;
    }

    @PostMapping("/addVendor")
    Vendor newVendor(@RequestBody VendorRequest vendorRequest){
        return vendorRepository.save(vendorService.newVendor(vendorRequest));
    }

}
