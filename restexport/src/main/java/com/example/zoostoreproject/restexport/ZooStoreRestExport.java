package com.example.zoostoreproject.restexport;


import com.example.zoostoreproject.api.Item.getItem.GetItemResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.UUID;

@Headers({"Content-Type: application/json"})
public interface ZooStoreRestExport {
    @RequestLine("GET /item/{itemId}")
    GetItemResponse getItemById(@Param String itemId);
}
