package com.carrywei.pattern.decorator;

public class Client {
    public static void main(String[] args) {
        // 珍珠奶茶
        MilkyTea milkyTea = new PearlMilkyTea();
        // 珍珠奶茶加布丁
        milkyTea = new Pudding(milkyTea);

        System.out.println(milkyTea.getDescription() + " " + milkyTea.cost());

        // 再加燕麦
        milkyTea = new Oat(milkyTea);
        System.out.println(milkyTea.getDescription() + " " + milkyTea.cost());

    }
}
