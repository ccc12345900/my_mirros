package com.example.jsoup1.Dao;

import com.example.jsoup1.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item,Long> {
}
