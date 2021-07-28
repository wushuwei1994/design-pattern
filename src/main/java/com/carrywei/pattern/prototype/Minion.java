package com.carrywei.pattern.prototype;

/**
 * Created by wushuwei on 2021/7/28.
 * 描述：小兵
 */
public class Minion implements Cloneable{
    /**
     * 小兵类型：近战小兵MeleeMinion、远程小兵CasterMinion、攻城小兵SiegeMinion、超级兵SuperMinion
     */
    private String type;

    /**
     * 颜色
     */
    private String color;

    /**
     * 血量
     */
    private int hp;

    public Minion(String type, String color, int hp) {
        System.out.println("开始构造小兵");
        this.type = type;
        this.color = color;
        this.hp = hp;
    }

    @Override
    public Minion clone() {
        try {
            return (Minion) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void display() {
        System.out.println("我是" + type + "小兵" + ";颜色：" + color + ";血量：" + hp);
    }



    public static void main(String[] args) throws Exception{
        Minion minion = new Minion("Melee", "Blue", 200);
        Minion minionCopy1 = minion.clone();
        System.out.println(minion == minionCopy1);
        minionCopy1.display();
    }
}
