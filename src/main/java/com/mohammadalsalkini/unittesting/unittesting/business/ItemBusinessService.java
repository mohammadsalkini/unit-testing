package com.mohammadalsalkini.unittesting.unittesting.business;

import com.mohammadalsalkini.unittesting.unittesting.data.repository.ItemRepository;
import com.mohammadalsalkini.unittesting.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemBusinessService {

    @Autowired
    ItemRepository itemRepository;

    public Item retrieveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems() {
        List<Item> items = itemRepository.findAll();

        for (Item item:
             items) {
            item.setValues(item.getPrice() * item.getQuantity());
        }
        return items;
    }

}
