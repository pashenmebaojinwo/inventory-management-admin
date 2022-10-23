package com.hongfa.domain.goods;

import com.hongfa.domain.inventory.count.InventoryCount;
import com.hongfa.domain.inventory.record.InventoryRecord;

public class AbstractGoodsTemplate implements Goods {

    @Override
    public InventoryCount init() {
        return null;
    }

    @Override
    public InventoryRecord addTotalNumber() {
        return null;
    }

    @Override
    public InventoryRecord reduceTotalNumber() {
        return null;
    }
}
