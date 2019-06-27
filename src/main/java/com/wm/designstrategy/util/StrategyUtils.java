package com.wm.designstrategy.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author 王锰
 * @date 14:23 2019/6/27
 */
public class StrategyUtils {

    /**
     * 反射获取business
     */
    public static <T> String getStrategy(T dto) {
        List<Field> recursive = recursive(new ArrayList<>(), dto.getClass());
        Field nameField = null;
        for (Field field : recursive) {
            if("business".equals(field.getName())){
                nameField = field;
                break;
            }
        }
        try {
            return Optional.ofNullable(nameField).map(f->{
                f.setAccessible(true);
                return f;
            }).orElseThrow(() -> new RuntimeException("business未定义")).get(dto) + "Strategy";
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("business未定义");
        }
    }

    /**
     * 递归获取字段，包含父类
     */
    private static List<Field> recursive(List<Field> list, Class<?> clazz) {
        if (clazz != null) {
            list.addAll(Arrays.asList(clazz.getDeclaredFields()));
            return recursive(list, clazz.getSuperclass());
        } else {
            return list;
        }
    }
}
