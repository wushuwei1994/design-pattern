package com.carrywei.pattern.factory.abstractFactory;

import com.carrywei.pattern.factory.card.ACard;
import com.carrywei.pattern.factory.card.ICard;
import com.carrywei.pattern.factory.product.AProduct;
import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description A工厂
 * @Date 2021/7/26
 **/
public class AFactory implements AbstractFactory {
    @Override
    public IProduct createProduct() {
        return new AProduct();
    }

    @Override
    public ICard createCard() {
        return new ACard();
    }
}
