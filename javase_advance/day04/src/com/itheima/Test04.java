package com.itheima;

public class Test04 {
    public static void main(String[] args) {
        A a = new A();
        a.method();

        Inter i =new Inter(){

            @Override
            public void method() {
                System.out.println("杨博龙1号");
            }

            @Override
            public void show() {
                System.out.println("杨博龙2号");
            }
        };
        i.method();
        i.show();
    }
}

interface Inter{
    public abstract void method();
    public abstract void show();
}

class A implements Inter{

    @Override
    public void method() {

    }

    @Override
    public void show() {

    }
}
