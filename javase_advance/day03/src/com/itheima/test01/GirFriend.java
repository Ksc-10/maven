package com.itheima.test01;

public class GirFriend implements ICoder,IGame {
    @Override
    public void code() {
        System.out.println("学java");
    }

    @Override
    public void play() {
        System.out.println("打魔兽");
    }
}


