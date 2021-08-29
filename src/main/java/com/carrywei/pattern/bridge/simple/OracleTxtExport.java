package com.carrywei.pattern.bridge.simple;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public class OracleTxtExport extends TxtExport {
    @Override
    public void export() {
        System.out.println("获取Oracle数据");
        super.export();
    }
}
