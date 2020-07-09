package com.itheima.test03;

public class Fu {
    int num = 10;
    public void method(){
        System.out.println("fu...method");
    }
}

class Zi extends Fu{
    int num = 20;

    public void method(){
        System.out.println("zi...method");
    }
}

class Test{
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
        f.method();
    }
}
