package com.carrywei.pattern.factory.abstractFactory;

import com.carrywei.pattern.factory.card.ICard;
import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/7/26
 **/
public class Client {
    public static void main(String[] args) {
        // A系统产品
        AbstractFactory aFactory = new AFactory();
        IProduct aProduct = aFactory.createProduct();
        ICard aCard = aFactory.createCard();
        aProduct.display();
        aCard.display();

        // B系列产品
        AbstractFactory bFactory = new BFactory();
        IProduct bProduct = bFactory.createProduct();
        ICard bCard = bFactory.createCard();
        bProduct.display();
        bCard.display();
    }
}
