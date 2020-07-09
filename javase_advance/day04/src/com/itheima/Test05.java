package com.itheima;

public class Test05 {
    public static void main(String[] args) {
        Person person = new Person();
        useSwimming(person);


        useSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("自由泳");
            }
        });
    }
    public static void useSwimming(Swimming swimming){
        swimming.swim();
    }
}

interface Swimming{
    public abstract void swim();
}

class Person implements Swimming{
    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}