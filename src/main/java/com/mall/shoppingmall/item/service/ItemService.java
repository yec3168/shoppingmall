package com.mall.shoppingmall.item.service;

import com.mall.shoppingmall.item.entity.Item;
import com.mall.shoppingmall.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    
    //상품 DB에 등록
    public void registration(Item item){
        itemRepository.save(item);
    }
            
}

