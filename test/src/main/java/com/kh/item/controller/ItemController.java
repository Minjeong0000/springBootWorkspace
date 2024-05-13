package com.kh.item.controller;

import com.kh.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("list")
    public String findItemAll(){

        return itemService.findItemAll();
    }
    @GetMapping("one")
    public String findItemByNo(){

        return itemService.findItemByNo();

    }
    @PostMapping("insert")
    public String insertItem(){

        return itemService.insertItem();
    }


}
