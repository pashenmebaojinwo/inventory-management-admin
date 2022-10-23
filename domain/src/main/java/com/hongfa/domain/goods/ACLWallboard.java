package com.hongfa.domain.goods;

import com.hongfa.domain.inventory.count.InventoryCount;
import com.hongfa.domain.inventory.record.InventoryRecord;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 货物：ACL蒸压板
 */
@Data
@AllArgsConstructor
public class ACLWallboard implements Goods {
    /**
     * 主键
     */
    private Long id;

    /**
     * 货物名称
     */
    private String name;

    /**
     * 长度
     */
    private Integer length;

    /**
     * 宽度
     */
    private Integer width;

    /**
     * 面积
     */
    private Integer acreage;


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
