package com.itheima;

/**
 * @program: javase_advance
 * @description: Test03
 * @author: JMDZWT
 * @create: 2020-07-09 09:54
 */
public class Test03 {
    public static void main(String[] args) {
        //静态成员内部类访问
        Outer03.Inner inner = new Outer03.Inner();
        inner.show();
        //静态成员内部类的静态方法的访问
        Outer03.Inner.show2();
    }
}

class Outer03{
    public static class Inner{
        public void show(){
            System.out.println("static..show");
        }

        public static void show2(){
            System.out.println("static...show2");
        }
    }
}
