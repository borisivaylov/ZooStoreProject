package com.example.zoostoreproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService
{
    public String Success()
    {
        return "Success!";
    }

}
