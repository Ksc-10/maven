package com.itheima.test10;

public class Xiyiji extends Dianqi {
    private String leixing;
    private String rongliang;

    public Xiyiji() {
    }

    public Xiyiji(String pinpai, String yanse, String xinghao, String shoujia) {
        super(pinpai, yanse, xinghao, shoujia);
    }

    public Xiyiji(String leixing, String rongliang) {
        this.leixing = leixing;
        this.rongliang = rongliang;
    }

    public Xiyiji(String pinpai, String yanse, String xinghao, String shoujia, String leixing, String rongliang) {
        super(pinpai, yanse, xinghao, shoujia);
        this.leixing = leixing;
        this.rongliang = rongliang;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getRongliang() {
        return rongliang;
    }

    public void setRongliang(String rongliang) {
        this.rongliang = rongliang;
    }
}
