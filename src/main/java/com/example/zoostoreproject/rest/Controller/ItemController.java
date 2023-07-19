package com.example.zoostoreproject.rest.Controller;

import com.example.zoostoreproject.API.Operations.Item.archive.ItemArchiveRequest;
import com.example.zoostoreproject.API.Operations.Item.archive.ItemArchiveResponse;
import com.example.zoostoreproject.API.Operations.Item.attachMedia.AttachMediaResponse;
import com.example.zoostoreproject.API.Operations.Item.attachTag.AttachTagResponse;
import com.example.zoostoreproject.API.Operations.Item.create.CreateItemResponse;
import com.example.zoostoreproject.API.Operations.Item.update.UpdateItemRequest;
import com.example.zoostoreproject.API.Operations.Item.update.UpdateItemResponse;
import com.example.zoostoreproject.core.operations.item.archive.ItemArchiveService;
import com.example.zoostoreproject.API.Operations.Item.attachMedia.AttachMediaRequest;
import com.example.zoostoreproject.core.operations.item.attachMedia.AttachMediaService;
import com.example.zoostoreproject.API.Operations.Item.attachTag.AttachTagRequest;
import com.example.zoostoreproject.core.operations.item.attachTag.AttachTagService;
import com.example.zoostoreproject.API.Operations.Item.create.CreateItemRequest;
import com.example.zoostoreproject.core.operations.item.create.ItemCreateService;
import com.example.zoostoreproject.core.operations.item.update.ItemUpdateRequest;
import com.example.zoostoreproject.core.operations.item.update.ItemUpdateResponse;
import com.example.zoostoreproject.core.operations.item.update.ItemUpdateService;
import com.example.zoostoreproject.persistance.entity.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {




    private final ItemCreateService itemCreateService;
    private final AttachTagService attachTagService;
    private final AttachMediaService attachMediaService;
    private final ItemArchiveService itemArchiveService;
    private final ItemUpdateService itemUpdateService;


    @PostMapping("/additem")
    CreateItemResponse newItem(@RequestBody CreateItemRequest createItemRequest){
        return itemCreateService.process(createItemRequest);
    }
    @PutMapping("/attachItemTag")
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

}
