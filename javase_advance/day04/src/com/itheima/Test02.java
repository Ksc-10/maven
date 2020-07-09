package com.itheima;

/**
 * @program: javase_advance
 * @description:
 * @author: JMDZWT
 * @create: 2020-07-09 09:45
 */
public class Test02 {
    public static void main(String[] args) {
            Outer02 outer02 = new Outer02();
            outer02.showInner();
    }
}

class Outer02 {
    public void showInner(){
        Inner inner = new Inner();
        inner.show();
    }
    private class Inner{
        public void show(){
            System.out.println("show");
        }
    }
}
