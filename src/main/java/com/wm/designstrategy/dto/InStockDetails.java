package com.wm.designstrategy.dto;

import com.wm.designstrategy.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author 王锰
 * @date 19:41 2019/6/26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class InStockDetails extends BaseDto {

    private int id;

    private List<String> details;

}
