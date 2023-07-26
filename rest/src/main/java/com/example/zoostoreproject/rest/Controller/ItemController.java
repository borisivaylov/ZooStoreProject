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
import com.example.zoostoreproject.api.Item.update.UpdateItemRequest;
import com.example.zoostoreproject.api.Item.update.UpdateItemResponse;
import com.example.zoostoreproject.core.item.archive.ItemArchiveService;
import com.example.zoostoreproject.core.item.attachMedia.AttachMediaService;
import com.example.zoostoreproject.core.item.attachTag.AttachTagService;
import com.example.zoostoreproject.core.item.create.ItemCreateService;
import com.example.zoostoreproject.core.item.getItem.GetItemOperation;
import com.example.zoostoreproject.core.item.update.ItemUpdateService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {




    private final ItemCreateService itemCreateService;
    private final AttachTagService attachTagService;
    private final AttachMediaService attachMediaService;
    private final ItemArchiveService itemArchiveService;
    private final ItemUpdateService itemUpdateService;
    private final GetItemOperation getItemService;


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
    @GetMapping("/{uuid}")
    GetItemResponse getItem(@PathVariable UUID uuid){
        return getItemService.process(GetItemRequest.builder().itemId(uuid).build());
    }

}
