package com.carrywei.pattern.builder;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/2
 **/
public interface Builder {
    void builtPartA();

    void builtPartB();

    void builtPartC();

    default Product build() {
        this.builtPartA();
        this.builtPartB();
        this.builtPartC();
        return new Product();
    }
}
