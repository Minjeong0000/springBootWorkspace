package com.kh.item.service;

import com.kh.item.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemDao itemDao;

    public String findItemAll() {

        return itemDao.findItemAll();

    }

    public String findItemByNo() {

        return itemDao.findItemByNo();
    }

    public String insertItem() {

        return itemDao.insertItem();
    }
}
