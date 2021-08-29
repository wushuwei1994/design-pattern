package com.carrywei.pattern.bridge.simple;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public abstract class TxtExport implements Export{
    @Override
    public void export() {
        System.out.println("导出txt格式数据");
    }
}
