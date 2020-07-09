package com.itheima;

public class Test08 {
    public static void main(String[] args) {
        //匿名内部类
        useCalculator(new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a + b;
            }
        });
        //Lambda类型
        useCalculator((int a,int b) -> {
            return a * b;
        });

        useCalculator2((a,b) -> {
            return a+b;
        },10,20);

        useCalculator3((a,b) -> {
            System.out.println(a+b);
        },"456","789");
    }

    public static void useCalculator(Calculator calculator) {
        int result = calculator.cal(20,30);
        System.out.println(result);
    }

    public static void useCalculator2(Calculator2 calculator2,int a,int b ){
        int sum = calculator2.cal2(a,b);
        System.out.println(sum);
    }

    public static void useCalculator3(Calculator3 calculator3,String a,String b){
        calculator3.cal3(a,b);
    }
}

interface Calculator{
    public abstract int cal(int a,int b);
}

interface Calculator2{
    public abstract int cal2(int a,int b);
}

interface Calculator3{
    public abstract void cal3(String a,String b);
}
