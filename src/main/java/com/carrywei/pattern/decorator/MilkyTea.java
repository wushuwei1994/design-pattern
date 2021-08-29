package com.carrywei.pattern.decorator;

/**
 * @Author wushuwei
 * @Description 奶茶抽象类
 * @Date 2021/8/27
 **/
public abstract class MilkyTea {
    /**
     * 获取奶茶描述
     */
    public abstract String getDescription();

    /**
     * 计价
     * @return
     */
    public abstract double cost();
}
