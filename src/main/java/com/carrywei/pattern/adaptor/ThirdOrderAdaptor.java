package com.carrywei.pattern.adaptor;

import com.carrywei.pattern.adaptor.third.ThirdOrderService;

/**
 * @Author wushuwei
 * @Description 第三方订单适配器
 * @Date 2021/8/5
 **/
public class ThirdOrderAdaptor implements Order {
    public ThirdOrderService thirdOrder;

    public ThirdOrderAdaptor() {
        this.thirdOrder = new ThirdOrderService();
    }
    @Override
    public void createOrder() {
        thirdOrder.thirdCreateOrder();

    }
}
