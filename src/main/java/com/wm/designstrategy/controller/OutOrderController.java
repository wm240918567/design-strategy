package com.wm.designstrategy.controller;

import com.wm.designstrategy.dto.InOrderCreate;
import com.wm.designstrategy.dto.OutOrderCreate;
import com.wm.designstrategy.dto.OutStockDetails;
import com.wm.designstrategy.service.strategy.CreateStrategyContext;
import com.wm.designstrategy.service.strategy.OutStockStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王锰
 * @date 15:54 2019/6/26
 */
@RestController
public class OutOrderController {

    private final CreateStrategyContext createStrategyContext;

    private final OutStockStrategyContext outStockStrategyContext;

    @Autowired
    public OutOrderController(CreateStrategyContext createStrategyContext, OutStockStrategyContext outStockStrategyContext) {
        this.createStrategyContext = createStrategyContext;
        this.outStockStrategyContext = outStockStrategyContext;
    }

    @PostMapping("/out/create/")
    public boolean outCreate(@RequestBody OutOrderCreate order) {
        return createStrategyContext.create(order);
    }


    @PostMapping("/out/stock")
    public boolean outStock(@RequestBody OutStockDetails details){
        return outStockStrategyContext.out(details);
    }

}
