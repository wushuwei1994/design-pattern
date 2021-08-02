package com.carrywei.pattern.builder;

/**
 * Created by wushuwei on 2021/8/2.
 * 描述：
 */
public class DiDiBicycleBuilder implements BicycleBuilder {

    private Bicycle bicycle;

    public DiDiBicycleBuilder() {
        bicycle = new Bicycle();
    }

    @Override
    public void builtWheel(String wheel) {
        this.bicycle.setWheel(wheel);
    }

    @Override
    public void builtPedal(String pedal) {
        this.bicycle.setPedal(pedal);
    }

    @Override
    public void builtCrossbar(String crossbar) {
        this.bicycle.setCrossbar(crossbar);
    }

    @Override
    public void buildSaddle(String saddle) {
        this.bicycle.setSaddle(saddle);
    }

    @Override
    public void buildHandlebars(String handlebars) {
        this.bicycle.setHandlebars(handlebars);
    }

    @Override
    public Bicycle build() {
        return bicycle;
    }
}
