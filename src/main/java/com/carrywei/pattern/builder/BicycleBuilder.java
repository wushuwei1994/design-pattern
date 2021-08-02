package com.carrywei.pattern.builder;

/**
 * @Author wushuwei
 * @Description 自称车建造者
 * @Date 2021/8/2
 **/
public interface BicycleBuilder {

    void builtWheel(String wheel);

    void builtPedal(String pedal);

    void builtCrossbar(String crossbar);

    void buildSaddle(String saddle);

    void buildHandlebars(String handlebars);

    Bicycle build();
}
