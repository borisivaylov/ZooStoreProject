package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Mappers.Mapper;
import com.example.zoostoreproject.Services.ItemServiceImpl;
import com.example.zoostoreproject.Services.TagServiceImpl;
import com.example.zoostoreproject.Services.VendorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/home")
public class ItemController {

    ItemServiceImpl itemService;
    TagServiceImpl tagService;
    VendorServiceImpl vendorService;

    public ItemController(ItemServiceImpl itemService, TagServiceImpl tagService, VendorServiceImpl vendorService) {
        this.itemService = itemService;
        this.tagService = tagService;
        this.vendorService = vendorService;
    }

    //@Tag(name = "Add item", description = "Create item")
    @PostMapping("/additem")
    public ResponseEntity addItem(){
        return ResponseEntity.ok(itemService.okStatus());
    }
    @PostMapping("/additemtags")
    public ResponseEntity addItemTags(){
        return ResponseEntity.ok(itemService.okStatus());
    }
    @PostMapping("/AddItemMedia")
    public ResponseEntity addItemMedia(){
        return ResponseEntity.ok(itemService.okStatus());
    }
    @PostMapping("/TagTest")
    public ResponseEntity tagTest(){
        return ResponseEntity.ok(tagService.Success());
    }
    @PostMapping("/VendorTest")
    public ResponseEntity vendorTest(){return ResponseEntity.ok(vendorService.Success());}
}
