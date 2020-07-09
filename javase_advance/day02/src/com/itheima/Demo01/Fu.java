package com.itheima.Demo01;

public class Fu {
    private void myPrivate(){
        System.out.println("private");
    }
    void myFriend(){
        System.out.println("默认");
    }
    protected void myProtected(){
        System.out.println("protected");
    }
    public void myPublic(){
        System.out.println("public");
    }

    private void test(){
        myPrivate();
        myFriend();
        myProtected();
        myPublic();
    }
}
