package com.itheima;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.next();

        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                while (true){
                    s = sc.next();
                    if (s.equals("上课")){
                        System.out.println("杨博龙睡觉了");
                    }else if (s.equals("下课")){
                        System.out.println("杨博龙睡醒了");
                    }else {
                        System.out.println("杨博龙请假了,请明天再来!");
                        break;
                    }
                }
                //System.out.println("杨博龙睡觉了");
            }
        });

        useFlyable((String s) -> {System.out.println(s+"杨博龙又睡觉了");});
    }

    public static void useFlyable(Flyable flyable){
       flyable.fly("上课");
    }
}

interface Flyable{
    public abstract void fly(String s);
}

class B implements Flyable{
    @Override
    public void fly(String s) {
    }
}
