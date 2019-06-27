package com.wm.designstrategy.service.outstock;

/**
 * @author 王锰
 * @date 14:24 2019/6/26
 */
public interface OutStockStrategy<T> {

    /**
     * 出库
     */
    boolean out(T details);

}
