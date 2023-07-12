package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Data.Entity.Item;
import com.example.zoostoreproject.API.Operations.Item.ItemRequest;
import com.example.zoostoreproject.Data.Repository.ItemRepository;
import com.example.zoostoreproject.Bussiness.operations.item.ItemServiceImpl;
import com.example.zoostoreproject.Bussiness.operations.tag.TagServiceImpl;
import com.example.zoostoreproject.Bussiness.operations.vendor.VendorServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    private final ItemRepository itemRepository;
    ItemServiceImpl itemService;
    TagServiceImpl tagService;
    VendorServiceImpl vendorService;

    public ItemController(ItemRepository itemRepository, ItemServiceImpl itemService, TagServiceImpl tagService, VendorServiceImpl vendorService) {
        this.itemRepository = itemRepository;
        this.itemService = itemService;
        this.tagService = tagService;
        this.vendorService = vendorService;
    }

    //@Tag(name = "Add item", description = "Create item")
    @PostMapping("/additem")
    Item newItem(@RequestBody ItemRequest itemRequest){
        return itemRepository.save(itemService.createItem(itemRequest));
    }
    @PostMapping("/additemtags")
    public ResponseEntity addItemTags(){
        return ResponseEntity.ok(itemService.okStatus());
    }
    @PostMapping("/AddItemMedia")
    public ResponseEntity addItemMedia(){
        return ResponseEntity.ok(itemService.okStatus());
    }

    @PostMapping("/VendorTest")
    public ResponseEntity vendorTest(){return ResponseEntity.ok(vendorService.Success());}
}
