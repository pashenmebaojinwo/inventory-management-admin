package com.hongfa.domain.inventory.record;

import lombok.Data;

/**
 * 出库记录
 */
@Data
public class DeliveryRecord {
    private Long id;
    private Long wallboardId;
    private Integer number;
}
