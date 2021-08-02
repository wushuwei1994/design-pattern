package com.carrywei.pattern.prototype;

import java.io.Serializable;

/**
 * @Author wushuwei
 * @Description 武器类
 * @Date 2021/7/30
 **/
public class Weapon implements Cloneable, Serializable{
    /**
     * 武器类型
     */
    private String type;

    /**
     * 武器是否损坏
     */
    private boolean isDamage;

    public Weapon(String type) {
        this.type = type;
        isDamage = false;
    }

    /**
     * 武器损坏
     */
    public void destroy() {
        this.isDamage = true;
    }

    /**
     * 武器是否损坏
     * @return
     */
    public boolean isDamage() {
        return isDamage;
    }

    @Override
    public Weapon clone() {
        try {
            return (Weapon) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
