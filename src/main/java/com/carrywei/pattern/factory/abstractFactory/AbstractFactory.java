package com.carrywei.pattern.factory.abstractFactory;

import com.carrywei.pattern.factory.card.ICard;
import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description 抽象工厂
 * @Date 2021/7/26
 **/
public interface AbstractFactory {
    /**
     * 创建商品
     * @return
     */
    IProduct createProduct();

    /**
     * 创建卡券
     * @return
     */
    ICard createCard();
}
