package com.carrywei.pattern.adaptor;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/5
 **/
public class Client {
    public static void main(String[] args) {
        Order order = new ThirdOrderAdaptor();
        order.createOrder();
    }
}
