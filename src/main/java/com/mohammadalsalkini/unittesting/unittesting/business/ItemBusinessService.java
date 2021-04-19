package com.mohammadalsalkini.unittesting.unittesting.business;

import com.mohammadalsalkini.unittesting.unittesting.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemBusinessService {

    public Item retrieveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

}
