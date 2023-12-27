package com.mall.shoppingmall.item.repository;

import com.mall.shoppingmall.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findItemByItemId(Long id);
}
