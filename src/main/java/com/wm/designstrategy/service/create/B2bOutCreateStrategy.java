package com.wm.designstrategy.service.create;

import com.wm.designstrategy.dto.OutOrderCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 王锰
 * @date 15:05 2019/6/26
 */
@Slf4j
@Service("b2bOutCreate")
public class B2bOutCreateStrategy extends AbstractCreateStrategy<OutOrderCreate> implements CreateStrategy<OutOrderCreate> {

    @Override
    protected boolean checkParamter(OutOrderCreate dto) {
        log.info("b2bOutCreate--校验数据");
        return true;
    }

    @Override
    protected boolean save(OutOrderCreate dto) {
        log.info("b2bOutCreate--保存主表");
        return true;
    }

    @Override
    protected boolean saveAfter(OutOrderCreate dto) {
        log.info("b2bOutCreate--保存后处理");
        return true;
    }

    @Override
    protected boolean sendOther() {
        return false;
    }
}


