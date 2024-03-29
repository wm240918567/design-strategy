package com.wm.designstrategy.service.strategy;

import com.wm.designstrategy.service.instock.InStockStrategy;
import com.wm.designstrategy.util.StrategyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 王锰
 * @date 14:31 2019/6/27
 */
@Component
public class InStockStrategyContext {

    private final Map<String, InStockStrategy<Object>> map = new ConcurrentHashMap<>();

    @Autowired
    public InStockStrategyContext(Map<String,InStockStrategy> map){
        this.map.clear();
        map.forEach(this.map::put);
    }

    public <T> boolean in(T details,String type){
//        String type = StrategyUtils.getStrategy(details);
        return Optional.ofNullable(map.get(type)).orElseThrow(()->new RuntimeException("错误的业务类型")).in(details);
    }


}
