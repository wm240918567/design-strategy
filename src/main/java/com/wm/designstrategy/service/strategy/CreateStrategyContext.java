package com.wm.designstrategy.service.strategy;

import com.wm.designstrategy.service.create.CreateStrategy;
import com.wm.designstrategy.util.StrategyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 王锰
 * @date 15:46 2019/6/26
 */
@Component
public class CreateStrategyContext extends AbstractStrategyContext<CreateStrategy> {

    public <T> boolean create(T dto,String type) {
        return getStrategy(type).create(dto);
    }


}
