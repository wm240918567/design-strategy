package com.wm.designstrategy.controller;

import com.wm.designstrategy.dto.InOrderCreate;
import com.wm.designstrategy.dto.OutOrderCreate;
import com.wm.designstrategy.dto.OutStockDetails;
import com.wm.designstrategy.service.strategy.CreateStrategyContext;
import com.wm.designstrategy.service.strategy.OutStockStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 王锰
 * @date 15:54 2019/6/26
 */
@RestController
@RequestMapping("/out")
public class OutOrderController {

    private final CreateStrategyContext createStrategyContext;

    private final OutStockStrategyContext outStockStrategyContext;

    @Autowired
    public OutOrderController(CreateStrategyContext createStrategyContext, OutStockStrategyContext outStockStrategyContext) {
        this.createStrategyContext = createStrategyContext;
        this.outStockStrategyContext = outStockStrategyContext;
    }

    @PostMapping("/create/{type}")
    public boolean outCreate(@RequestBody OutOrderCreate order, @PathVariable("type")String type) {
        return createStrategyContext.create(order,type);
    }


    @PostMapping("/stock/{type}")
    public boolean outStock(@RequestBody OutStockDetails details,@PathVariable("type")String type){
        return outStockStrategyContext.out(details,type);
    }

}
