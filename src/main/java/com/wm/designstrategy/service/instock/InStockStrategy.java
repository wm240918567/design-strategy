package com.wm.designstrategy.service.instock;

/**
 * @author 王锰
 * @date 14:24 2019/6/26
 */
public interface InStockStrategy<T> {

    /**
     * 入库操作
     */
    boolean in(T details);

}
