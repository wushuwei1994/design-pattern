package com.carrywei.pattern.builder;

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

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getPedal() {
        return pedal;
    }

    public void setPedal(String pedal) {
        this.pedal = pedal;
    }

    public String getCrossbar() {
        return crossbar;
    }

    public void setCrossbar(String crossbar) {
        this.crossbar = crossbar;
    }

    public String getSaddle() {
        return saddle;
    }

    public void setSaddle(String saddle) {
        this.saddle = saddle;
    }

    public String getHandlebars() {
        return handlebars;
    }

    public void setHandlebars(String handlebars) {
        this.handlebars = handlebars;
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
