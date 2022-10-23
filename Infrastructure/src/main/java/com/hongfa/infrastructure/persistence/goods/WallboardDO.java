package com.hongfa.infrastructure.persistence.goods;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品：墙板
 */
@Data
public class WallboardDO {
    private Long id;

    /**
     * 商品名称
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

    private BigDecimal cost;
}
