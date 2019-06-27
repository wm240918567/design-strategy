package com.wm.designstrategy.service.outstock;

import com.wm.designstrategy.dto.OutStockDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 王锰
 * @date 15:31 2019/6/26
 */
@Slf4j
@Service
public class B2bOutStockStrategy implements OutStockStrategy<OutStockDetails> {

    @Override
    public boolean out(OutStockDetails details) {
        log.info("B2B的出库业务处理:{}", details);
        return true
                ;
    }
}
