package com.itheima.test04;

import com.itheima.test02.C;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        use(dog);
        use(cat);
    }

    public static void use(Animal animal){
        animal.eat();

        if (animal instanceof Dog){
            Dog d = (Dog) animal;
            d.WatchHome();
        }
    }
}



abstract class Animal{
    public abstract void eat();
}

 class Dog extends Animal{
     @Override
     public void eat() {
         System.out.println("狗吃肉");
     }

     public void WatchHome(){
         System.out.println("看家");
     }
 }

 class Cat extends Animal{
     @Override
     public void eat() {
         System.out.println("猫吃鱼");
     }
 }
