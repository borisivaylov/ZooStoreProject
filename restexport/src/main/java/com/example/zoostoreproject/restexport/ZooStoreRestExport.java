package com.example.zoostoreproject.restexport;


import com.example.zoostoreproject.api.Item.getItem.GetItemResponse;
import com.example.zoostoreproject.api.Item.getallitems.GetAllItemsResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;
import java.util.UUID;

@Headers({"Content-Type: application/json"})
public interface ZooStoreRestExport {
    @RequestLine("GET /item/getbyId/{itemId}")
    GetItemResponse getItemById(@Param String itemId);
    @RequestLine("GET /item/{tagName}")
    List<GetAllItemsResponse> getItemsByTag(@Param String tagName);

}
