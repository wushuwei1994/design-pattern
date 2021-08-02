package com.carrywei.pattern.builder.chainCall;

/**
 * Created by wushuwei on 2021/8/2.
 * 描述：
 */
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle.BicycleBuilder().wheel("山地车轮子").crossbar("不锈钢车身").handlebars("减压车把").built();
        System.out.println(bicycle);
    }
}
