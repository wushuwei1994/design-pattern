package com.carrywei.pattern.decorator;

/**
 * 布丁
 */
public class Pudding extends Charge{

    public Pudding(MilkyTea milkyTea){
        super(milkyTea);
    }


    @Override
    public String getDescription() {
        return super.milkyTea.getDescription() + "+布丁" ;
    }

    @Override
    public double cost() {
        return super.milkyTea.cost() + 2;
    }
}
