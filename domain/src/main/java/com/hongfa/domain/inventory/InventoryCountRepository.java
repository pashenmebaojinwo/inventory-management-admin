package com.hongfa.domain.inventory;

/**
 * 库存仓储服务
 */
public interface InventoryCountRepository {
    /**
     * 保存或者更新
     * @return
     */
    Integer save();

    /**
     * 逻辑删除
     * @return
     */
    Integer remove();

}
