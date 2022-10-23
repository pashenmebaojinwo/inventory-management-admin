package com.hongfa.domain.goods;


import com.hongfa.domain.inventory.count.InventoryCount;
import com.hongfa.domain.inventory.record.InventoryRecord;

/**
 * 货物
 */
public interface Goods {

    /**
     * 初始化库存
     */
    InventoryCount init();

    /**
     * 添加库存数量
     */
    InventoryRecord addTotalNumber();

    /**
     * 减少库存
     * @return
     */
    InventoryRecord reduceTotalNumber();
}
