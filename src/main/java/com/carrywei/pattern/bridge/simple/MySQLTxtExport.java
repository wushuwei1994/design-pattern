package com.carrywei.pattern.bridge.simple;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public class MySQLTxtExport extends TxtExport{
    @Override
    public void export() {
        System.out.println("获取MySQL数据");
        super.export();
    }
}
