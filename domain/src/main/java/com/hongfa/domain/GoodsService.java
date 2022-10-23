package com.hongfa.domain;

import com.hongfa.domain.goods.Goods;

public interface GoodsService {
    /**
     * 入库
     * @param id
     * @param number
     * @return
     */
    Integer fortifyInventory(Long id, Integer number);


    /**
     * 出库
     * @param id
     * @param number
     * @return
     */
    Integer reduceInventory(Long id, Integer number);


    /**
     * 初始化商品库存
     * @param goods
     * @return
     */
    Integer initInventory(Goods goods);


}

