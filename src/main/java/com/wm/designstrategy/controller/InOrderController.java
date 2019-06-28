package com.wm.designstrategy.controller;

import com.wm.designstrategy.dto.InOrderCreate;
import com.wm.designstrategy.dto.InStockDetails;
import com.wm.designstrategy.service.strategy.CreateStrategyContext;
import com.wm.designstrategy.service.strategy.InStockStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 王锰
 * @date 14:38 2019/6/27
 */
@RestController
@RequestMapping("/in")
public class InOrderController {

    private final CreateStrategyContext createStrategyContext;

    private final InStockStrategyContext inStockStrategyContext;

    @Autowired
    public InOrderController(CreateStrategyContext createStrategyContext, InStockStrategyContext inStockStrategyContext) {
        this.createStrategyContext = createStrategyContext;
        this.inStockStrategyContext = inStockStrategyContext;
    }

    @PostMapping("/create/{type}")
    public boolean inCreate(@RequestBody InOrderCreate order, @PathVariable("type")String type) {
        return createStrategyContext.create(order,type);
    }

    @PostMapping("/stock/{type}")
    public boolean instock(@RequestBody InStockDetails details,@PathVariable("type")String type){
        return inStockStrategyContext.in(details,type);
    }


}
