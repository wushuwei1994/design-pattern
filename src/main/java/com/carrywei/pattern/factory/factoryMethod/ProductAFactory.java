package com.carrywei.pattern.factory.factoryMethod;

import com.carrywei.pattern.factory.product.AProduct;
import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/7/26
 **/
public class ProductAFactory implements IProductFactory {
    @Override
    public IProduct createProduct() {
        return new AProduct();
    }

}
