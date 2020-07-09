package com.itheima;

/**
 * @program: javase_advance
 * @description: Test
 * @author: JMDZWT
 * @create: 2020-07-09 09:25
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer{
    private int num=10;

    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        //外部类使用内部类
        Inner i= new Inner();
        i.show();
    }
}
