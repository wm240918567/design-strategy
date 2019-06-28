package com.wm.designstrategy.service.create;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王锰
 * @date 17:36 2019/6/27
 */
@Slf4j
public abstract class AbstractCreateStrategy<T> implements CreateStrategy<T> {

    @Override
    public boolean create(T order) {
        log.info("创建");
        return checkParamter(order) && save(order) && saveAfter(order);
    }

    protected abstract boolean checkParamter(T dto);

    protected abstract boolean save(T dto);

    protected abstract boolean saveAfter(T dto);

    protected abstract boolean sendOther();

}
