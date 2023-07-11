package com.example.zoostoreproject.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService
{
    public String Success()
    {
        return "Success!";
    }
}
