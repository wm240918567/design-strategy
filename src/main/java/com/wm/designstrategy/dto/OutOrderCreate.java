package com.wm.designstrategy.dto;

import com.wm.designstrategy.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author 王锰
 * @date 15:38 2019/6/26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class OutOrderCreate extends BaseDto {

    private int id;

}
