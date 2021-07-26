package com.carrywei.pattern.factory.factoryMethod;

import com.carrywei.pattern.factory.product.IProduct;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/7/26
 **/
public class Client {
    public static void main(String[] args) {
        // A产品工厂
        IProductFactory aProductFactory = new ProductAFactory();
        // 创建A产品
        IProduct aProduct = aProductFactory.createProduct();
        aProduct.display();
        // B产品工厂
        IProductFactory bProductFactory = new ProductBFactory();
        // 创建B产品
        IProduct bProduct = bProductFactory.createProduct();
        bProduct.display();
    }
}
