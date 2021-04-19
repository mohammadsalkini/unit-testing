package com.mohammadalsalkini.unittesting.unittesting.controller;

import com.mohammadalsalkini.unittesting.unittesting.model.Item;
import com.mohammadalsalkini.unittesting.unittesting.business.ItemBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemBusinessService itemBusinessService;

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService() {
        return itemBusinessService.retrieveHardcodedItem();
    }

    @GetMapping("/all-items-from-database")
    public List<Item> retrieveAllItems () {
        return itemBusinessService.retrieveAllItems();
    }
}
