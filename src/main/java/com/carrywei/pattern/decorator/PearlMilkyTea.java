package com.carrywei.pattern.decorator;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/27
 **/
public class PearlMilkyTea extends MilkyTea {
    @Override
    public String getDescription() {
        return "珍珠奶茶";
    }

    @Override
    public double cost() {
        return 11;
    }
}
