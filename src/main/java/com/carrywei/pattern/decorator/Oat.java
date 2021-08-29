package com.carrywei.pattern.decorator;

/**
 * 燕麦
 */
public class Oat extends Charge {
    public Oat(MilkyTea milkyTea) {
        super(milkyTea);
    }

    @Override
    public String getDescription() {
        return super.milkyTea.getDescription() + "+燕麦";
    }

    @Override
    public double cost() {
        return super.milkyTea.cost() + 1;
    }
}
