package com.wm.designstrategy.service.strategy;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Optional;

/**
 * @author 王锰
 * @date 20:14 2019/6/28
 */
@Data
public abstract class AbstractStrategyContext<R> {

    @Autowired
    Map<String, R> map;

    /**
     * 根据type获取对应的策略实例
     * @param type 策略名称
     * @return 策略实例
     */
    R getStrategy(String type) {
        return Optional.ofNullable(getMap().get(type)).orElseThrow(() -> new RuntimeException("类型：" + type + "未定义"));
    }

}
