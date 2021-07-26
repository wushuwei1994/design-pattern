package com.carrywei.pattern.factory.product;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/7/26
 **/
public class BProduct implements IProduct {
    @Override
    public void display() {
        System.out.println("我是B产品");
    }
}
