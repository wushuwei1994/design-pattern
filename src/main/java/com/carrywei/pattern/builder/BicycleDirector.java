package com.carrywei.pattern.builder;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/2
 **/
public class BicycleDirector {
    private BicycleBuilder builder;

    public BicycleDirector(BicycleBuilder builder) {
        this.builder = builder;
    }

    public Bicycle builtBicycle(String wheel, String pedal, String crossbar, String saddle, String handlebars) {
        builder.builtWheel(wheel);
        builder.builtPedal(pedal);
        builder.builtCrossbar(crossbar);
        builder.buildSaddle(saddle);
        builder.buildHandlebars(handlebars);
        return builder.build();
    }
}
