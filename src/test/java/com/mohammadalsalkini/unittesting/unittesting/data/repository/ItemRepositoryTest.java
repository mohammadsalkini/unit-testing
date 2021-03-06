package com.mohammadalsalkini.unittesting.unittesting.data.repository;

import com.mohammadalsalkini.unittesting.unittesting.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void testFindAll() {
        List<Item> items = itemRepository.findAll();
        assertEquals(3, items.size());
    }

}