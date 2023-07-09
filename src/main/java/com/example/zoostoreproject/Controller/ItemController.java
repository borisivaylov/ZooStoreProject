package com.example.zoostoreproject.Controller;

import com.example.zoostoreproject.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ItemController {

    @Autowired
    ItemService itemService = new ItemService();

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

}
