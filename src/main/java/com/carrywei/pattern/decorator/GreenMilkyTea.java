package com.carrywei.pattern.decorator;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/27
 **/
public class GreenMilkyTea extends MilkyTea {
    @Override
    public String getDescription() {
        return "奶绿";
    }

    @Override
    public double cost() {
        return 11;
    }
}
