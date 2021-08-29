package com.carrywei.pattern.bridge;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public class CsvExport extends AbstractExport {
    @Override
    public void export() {
        // 获取数据库数据
        super.server.getData();
        System.out.println("导出Csv格式数据");
    }
}
