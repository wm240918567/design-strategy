package com.wm.designstrategy.controller;

import com.wm.designstrategy.dto.InOrderCreate;
import com.wm.designstrategy.dto.InStockDetails;
import com.wm.designstrategy.service.strategy.CreateStrategyContext;
import com.wm.designstrategy.service.strategy.InStockStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王锰
 * @date 14:38 2019/6/27
 */
@RestController
public class InOrderController {

    private final CreateStrategyContext createStrategyContext;

    private final InStockStrategyContext inStockStrategyContext;

    @Autowired
    public InOrderController(CreateStrategyContext createStrategyContext, InStockStrategyContext inStockStrategyContext) {
        this.createStrategyContext = createStrategyContext;
        this.inStockStrategyContext = inStockStrategyContext;
    }

    @PostMapping("/in/create/")
    public boolean inCreate(@RequestBody InOrderCreate order) {
        return createStrategyContext.create(order);
    }

    @PostMapping("/in/stock")
    public boolean instock(@RequestBody InStockDetails details){
        return inStockStrategyContext.in(details);
    }


}
