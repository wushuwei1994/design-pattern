package com.carrywei.pattern.factory.card;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/7/26
 **/
public class BCard implements ICard {
    @Override
    public void display() {
        System.out.println("我是B卡券");
    }
}
