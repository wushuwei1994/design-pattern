package com.carrywei.pattern.builder;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/2
 **/
public class Main {
    public static void main(String[] args) {
        BicycleBuilder builder = new DiDiBicycleBuilder();
        BicycleDirector director = new BicycleDirector(builder);
        Bicycle bicycle = director.builtBicycle("青桔轮子", "青桔脚踏板", "青桔车身", "舒服的座椅", "青桔车手把");
        System.out.println(bicycle);
    }
}
