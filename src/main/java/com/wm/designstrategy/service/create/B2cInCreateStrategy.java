package com.wm.designstrategy.service.create;

import com.wm.designstrategy.dto.InOrderCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 王锰
 * @date 15:30 2019/6/26
 */
@Slf4j
@Service("b2cInCreate")
public class B2cInCreateStrategy extends AbstractCreateStrategy<InOrderCreate> implements CreateStrategy<InOrderCreate> {

    @Override
    protected boolean checkParamter(InOrderCreate dto) {
        log.info("b2cInCreate--校验数据");
        return true;
    }

    @Override
    protected boolean save(InOrderCreate dto) {
        log.info("b2cInCreate--主表保存");
        return true;
    }

    @Override
    protected boolean saveAfter(InOrderCreate dto) {
        log.info("b2cInCreate--主表保存后处理");
        return true;
    }

    @Override
    protected boolean sendOther() {
        return false;
    }
}
