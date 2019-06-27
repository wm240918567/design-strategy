package com.wm.designstrategy.service.instock;

import com.wm.designstrategy.dto.InStockDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 王锰
 * @date 15:32 2019/6/26
 */
@Slf4j
@Service
public class B2cInStockStrategy implements InStockStrategy<InStockDetails> {

    @Override
    public boolean in(InStockDetails details) {
        log.info("B2C入库操作业务处理:{}", details);
        return true;
    }
}
