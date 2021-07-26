package com.carrywei.pattern.factory;

import com.carrywei.pattern.factory.product.AProduct;
import com.carrywei.pattern.factory.product.BProduct;
import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/7/26
 **/
public class SimpleFactory {
    public static IProduct createProduct(String type) {
        if ("A".equals(type)) {
            return new AProduct();
        }
        if ("B".equals(type)) {
            return new BProduct();
        }
        return null;
    }

    public static void main(String[] args) {
        // A产品
        IProduct aProduct = SimpleFactory.createProduct("A");
        aProduct.display();
        // B产品
        IProduct bProduct = SimpleFactory.createProduct("B");
        bProduct.display();
    }
}
