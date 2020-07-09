package com.itheima.test02;

public interface  IMyInter {
    public abstract void eat();
    public default void drink(){
        System.out.println("drink");
    }
    public static void show(){
        System.out.println("static");
    }
}
