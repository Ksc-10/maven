package com.itheima;

public class Test06 {
    public static void main(String[] args) {
        useShowHandler(new showHandler() {
            @Override
            public void show() {
                System.out.println("111");
            }
        });

        useShowHandler(() -> {
            System.out.println("222");
        });
    }

    public static void useShowHandler(showHandler showHandler){
        showHandler.show();
    }
}

interface showHandler{
    public abstract void show();
}