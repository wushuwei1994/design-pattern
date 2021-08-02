package com.carrywei.pattern.builder.chainCall;

/**
 * Created by wushuwei on 2021/8/2.
 * 描述：自行车
 */
public class Bicycle {
    //轮子
    private String wheel;

    // 脚踏板
    private String pedal;

    // 车身
    private String crossbar;

    // 座椅
    private String saddle;

    // 车手把
    private String handlebars;


    private Bicycle(BicycleBuilder bicycleBuilder) {
        this.wheel = bicycleBuilder.wheel;
        this.pedal = bicycleBuilder.pedal;
        this.crossbar = bicycleBuilder.crossbar;
        this.saddle = bicycleBuilder.saddle;
        this.handlebars = bicycleBuilder.handlebars;
    }

    // 建造者，静态内部类。将创建的过程封装在建造者中
    public static class BicycleBuilder{
        //轮子
        private String wheel;
        // 脚踏板
        private String pedal;
        // 车身
        private String crossbar;
        // 座椅
        private String saddle;
        // 车手把
        private String handlebars;

        public BicycleBuilder wheel(String wheel){
            this.wheel = wheel;
            return this;
        }

        public BicycleBuilder pedal(String pedal) {
            this.pedal = pedal;
            return this;
        }

        public BicycleBuilder crossbar(String crossbar) {
            this.crossbar = crossbar;
            return this;
        }

        public BicycleBuilder saddle(String saddle) {
            this.saddle = saddle;
            return this;
        }

        public BicycleBuilder handlebars(String handlebars) {
            this.handlebars = handlebars;
            return this;
        }

        public Bicycle built() {
            return new Bicycle(this);
        }

    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "wheel='" + wheel + '\'' +
                ", pedal='" + pedal + '\'' +
                ", crossbar='" + crossbar + '\'' +
                ", saddle='" + saddle + '\'' +
                ", handlebars='" + handlebars + '\'' +
                '}';
    }
}
