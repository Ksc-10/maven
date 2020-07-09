package com.itheima.test10;

public class TestDianQI {
    public static void main(String[] args) {
        Dianshi dianshi = new Dianshi("1","2","3","4","5","6");
        Xiyiji xiyiji = new Xiyiji("1","2","3","4","5","6");
        Bingxiang bingxiang = new Bingxiang("1","2","3","4","5","6");

        System.out.println(dianshi.getPinpai()+" "+dianshi.getYanse()+" "+dianshi.getXinghao()+" "+dianshi.getShoujia()+" "+dianshi.getChicun()+" "+dianshi.getFenbianlui());
    }
}
