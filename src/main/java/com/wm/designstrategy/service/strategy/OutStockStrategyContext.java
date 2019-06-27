package com.wm.designstrategy.service.strategy;

import com.wm.designstrategy.service.outstock.OutStockStrategy;
import com.wm.designstrategy.util.StrategyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 王锰
 * @date 12:07 2019/6/27
 */
@Component
public class OutStockStrategyContext {

    private final Map<String, OutStockStrategy<Object>> map = new ConcurrentHashMap<>();

    @Autowired
    public OutStockStrategyContext(Map<String, OutStockStrategy> map) {
        this.map.clear();
        map.forEach(this.map::put);
    }

    public <T> boolean out(T details){
        String name = StrategyUtils.getStrategy(details);
        return map.get(name).out(details);
    }

}
