package com.wm.designstrategy.service.create;

import com.wm.designstrategy.dto.InOrderCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 王锰
 * @date 15:30 2019/6/26
 */
@Slf4j
@Service
public class B2cInCreateStrategy implements CreateStrategy<InOrderCreate> {

    @Override
    public boolean create(InOrderCreate inOrder) {
        log.info("B2C入库创建的业务处理:{}", inOrder);
        return true;
    }
}
