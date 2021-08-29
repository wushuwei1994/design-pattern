package com.carrywei.pattern.bridge;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/17
 **/
public class OracleServer implements Server {
    @Override
    public void getData() {
        System.out.println("获取Oracle数据");
    }
}
