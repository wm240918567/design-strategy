package com.wm.designstrategy.service.create;

/**
 * @author 王锰
 * @date 14:22 2019/6/26
 */
public interface CreateStrategy<T> {

    /**
     * 创建
     */
    boolean create(T order);
}
