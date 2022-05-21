package com.example.jsoup1.Service.impl;

import com.example.jsoup1.Dao.ItemDao;
import com.example.jsoup1.Service.ItemService;
import com.example.jsoup1.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ItemServiceimpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    @Override
    @Transactional
    public void Save(Item item) {
        this.itemDao.save(item);
    }

    @Override
    public List<Item> findAll(Item item) {
        //生命查询条件
        Example<Item> example = Example.of(item);

        //声明查询条件进行查询数据
        List<Item> list = this.itemDao.findAll(example);
        return list;
    }
}
