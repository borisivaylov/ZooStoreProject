package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Bussiness.operations.vendor.create.VendorCreateService;
import com.example.zoostoreproject.Bussiness.operations.vendor.update.VendorUpdateService;
import com.example.zoostoreproject.Data.Entity.Vendor;
import com.example.zoostoreproject.API.Operations.Vendor.VendorRequest;
import com.example.zoostoreproject.Data.Repository.VendorRepository;
import com.example.zoostoreproject.Bussiness.operations.vendor.VendorServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/vendor")
public class VendorController {


    private final VendorRepository vendorRepository;
    private final VendorCreateService vendorCreateService;
    private  final VendorUpdateService vendorUpdateService;

    public VendorController(VendorRepository vendorRepository, VendorCreateService vendorCreateService, VendorUpdateService vendorUpdateService) {
        this.vendorRepository = vendorRepository;
        this.vendorCreateService = vendorCreateService;
        this.vendorUpdateService = vendorUpdateService;
    }

    @PostMapping("/addVendor")
    Vendor newVendor(@RequestBody VendorRequest vendorRequest){
        return vendorRepository.save(vendorCreateService.newVendor(vendorRequest));
    }
    @PutMapping ("/updateVendor")
    Vendor updateVendor(@RequestBody UUID id, @RequestBody String newVendorName){
        return vendorRepository.save(vendorUpdateService.updateVendor(id,newVendorName));
    }

}
