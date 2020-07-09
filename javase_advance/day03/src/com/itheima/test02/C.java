package com.itheima.test02;

public class C {
    public static void main(String[] args) {
        A a = new A();
        a.eat();
        a.drink();

        IMyInter.show();

        B b = new B();
        b.eat();
        b.drink();
    }
}
