package com.example.jsoup1.Service;

import com.example.jsoup1.pojo.Item;

import java.util.List;


public interface ItemService {
    public void Save(Item item);

    public List<Item> findAll(Item item);
}
