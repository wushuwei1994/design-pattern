package com.carrywei.pattern.factory.abstractFactory;

import com.carrywei.pattern.factory.card.BCard;
import com.carrywei.pattern.factory.card.ICard;
import com.carrywei.pattern.factory.product.BProduct;
import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description B工厂
 * @Date 2021/7/26
 **/
public class BFactory implements AbstractFactory {
    @Override
    public IProduct createProduct() {
        return new BProduct();
    }

    @Override
    public ICard createCard() {
        return new BCard();
    }
}
