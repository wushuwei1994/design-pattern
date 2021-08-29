package com.carrywei.pattern.decorator;

public abstract class Charge extends MilkyTea{

    protected MilkyTea milkyTea;

    public Charge(MilkyTea milkyTea){
        this.milkyTea = milkyTea;
    }
}
