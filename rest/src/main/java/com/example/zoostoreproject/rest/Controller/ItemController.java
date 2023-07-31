package com.example.zoostoreproject.rest.Controller;

import com.example.zoostoreproject.api.Item.archive.ItemArchiveRequest;
import com.example.zoostoreproject.api.Item.archive.ItemArchiveResponse;
import com.example.zoostoreproject.api.Item.attachMedia.AttachMediaRequest;
import com.example.zoostoreproject.api.Item.attachMedia.AttachMediaResponse;
import com.example.zoostoreproject.api.Item.attachTag.AttachTagRequest;
import com.example.zoostoreproject.api.Item.attachTag.AttachTagResponse;
import com.example.zoostoreproject.api.Item.create.CreateItemRequest;
import com.example.zoostoreproject.api.Item.create.CreateItemResponse;
import com.example.zoostoreproject.api.Item.getItem.GetItemRequest;
import com.example.zoostoreproject.api.Item.getItem.GetItemResponse;
import com.example.zoostoreproject.api.Item.getallitems.GetAllItemsRequest;
import com.example.zoostoreproject.api.Item.getallitems.GetAllItemsResponse;
import com.example.zoostoreproject.api.Item.update.UpdateItemRequest;
import com.example.zoostoreproject.api.Item.update.UpdateItemResponse;
import com.example.zoostoreproject.core.item.archive.ItemArchiveOperationProcessor;
import com.example.zoostoreproject.core.item.attachMedia.AttachMediaOperationProcessor;
import com.example.zoostoreproject.core.item.attachTag.AttachTagOperationProcessor;
import com.example.zoostoreproject.core.item.create.ItemCreateOperationProcessor;
import com.example.zoostoreproject.core.item.getItem.GetItemOperationProcessor;
import com.example.zoostoreproject.core.item.getallitems.GetAllItemsOperationProcessor;
import com.example.zoostoreproject.core.item.update.ItemUpdateOperationProcessor;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {




    private final ItemCreateOperationProcessor itemCreateService;
    private final AttachTagOperationProcessor attachTagService;
    private final AttachMediaOperationProcessor attachMediaService;
    private final ItemArchiveOperationProcessor itemArchiveService;
    private final ItemUpdateOperationProcessor itemUpdateService;
    private final GetItemOperationProcessor getItemService;
    private final GetAllItemsOperationProcessor getAllItemsOperationProcessor;


    @PostMapping("/addItem")
    CreateItemResponse newItem(@RequestBody CreateItemRequest createItemRequest){
        return itemCreateService.process(createItemRequest);
    }
    @PostMapping("/attachItemTag")
    AttachTagResponse attachTag(@RequestBody AttachTagRequest attachTagRequest){
        return attachTagService.process(attachTagRequest);
    }
    @PostMapping("/attachItemMedia")
    AttachMediaResponse attachMedia(@RequestBody AttachMediaRequest attachMediaRequest){
        return attachMediaService.process(attachMediaRequest);
    }
    @PostMapping("/archiveItem")
    ItemArchiveResponse itemArchive(@RequestBody ItemArchiveRequest itemArchiveRequest) {
        return itemArchiveService.process(itemArchiveRequest);
    }

    @PostMapping("/updateItem")
    UpdateItemResponse itemUpdate(@RequestBody UpdateItemRequest updateItemRequest){
        return itemUpdateService.process(updateItemRequest);
    }
    @GetMapping("/getbyId/{uuid}")
    GetItemResponse getItem(@PathVariable UUID uuid){
        return getItemService.process(GetItemRequest.builder().itemId(uuid).build());
    }
    @GetMapping("/{tagName}")
    List<GetAllItemsResponse>getAllItemsByTag(@PathVariable String tagName){
        return getAllItemsOperationProcessor.process(GetAllItemsRequest.builder().tagName(tagName).build());
    }

}
