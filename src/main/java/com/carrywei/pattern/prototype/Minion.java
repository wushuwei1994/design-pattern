package com.carrywei.pattern.prototype;

import java.io.*;

/**
 * Created by wushuwei on 2021/7/28.
 * 描述：小兵
 */
public class Minion implements Cloneable, Serializable{
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

    /**
     * 武器
     */
    private Weapon weapon;

    public Minion(String type, String color, int hp) {
        System.out.println("开始构造小兵");
        this.type = type;
        this.color = color;
        this.hp = hp;
    }

    @Override
    public Minion clone() {
        // 克隆方式
//        try {
//            Minion copy = (Minion) super.clone();
//            // 克隆对象
//            Weapon weapon = this.weapon.clone();
//            copy.setWeapon(weapon);
//            return copy;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//            return null;
//        }
        // 序列化、反序列化方式
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (Minion) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void display() {
        System.out.println("我是" + type + "小兵" + ";颜色：" + color + ";血量：" + hp);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public static void main(String[] args) throws Exception{
        Minion minion = new Minion("Melee", "Blue", 200);
        Weapon weapon = new Weapon("刀");
        minion.setWeapon(weapon);
        Minion minionCopy =  minion.clone();

        System.out.println("复制小兵1武器是否损坏：" + minionCopy.getWeapon().isDamage());
        // 原始小兵武器损坏
        minion.getWeapon().destroy();
        System.out.println("复制小兵1武器是否损坏：" + minionCopy.getWeapon().isDamage());

//        System.out.println(minion.getWeapon() == minionCopy1.getWeapon());
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//        objectOutputStream.writeObject(minion);
//        System.out.println(byteArrayOutputStream.toString());
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
//        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
//        Object o = objectInputStream.readObject();
//        System.out.println(o);
    }
}
