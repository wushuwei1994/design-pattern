package com.carrywei.pattern.bridge.simple;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public abstract class CsvExport implements Export {
    @Override
    public void export() {
        System.out.println("导出csv格式数据");
    }
}
