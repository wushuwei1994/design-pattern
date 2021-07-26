package com.carrywei.pattern.factory.factoryMethod;

import com.carrywei.pattern.factory.product.BProduct;
import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/7/26
 **/
public class ProductBFactory implements IProductFactory {
    @Override
    public IProduct createProduct() {
        return new BProduct();
    }
}
