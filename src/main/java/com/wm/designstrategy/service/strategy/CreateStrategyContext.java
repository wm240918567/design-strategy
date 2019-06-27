package com.wm.designstrategy.service.strategy;

import com.wm.designstrategy.service.create.CreateStrategy;
import com.wm.designstrategy.util.StrategyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 王锰
 * @date 15:46 2019/6/26
 */
@Component
public class CreateStrategyContext {

    private final Map<String, CreateStrategy<Object>> map = new ConcurrentHashMap<>();

    @Autowired
    public CreateStrategyContext(Map<String, CreateStrategy> map) {
        this.map.clear();
        map.forEach(this.map::put);
    }

    public <T> boolean create(T dto) {
        String name = StrategyUtils.getStrategy(dto);
        return map.get(name).create(dto);
    }


}
