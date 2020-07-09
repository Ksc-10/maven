package com.itheima.test10;

public class Dianshi extends Dianqi{
    private String chicun;
    private String fenbianlui;

    public Dianshi() {
    }

    public Dianshi(String pinpai, String yanse, String xinghao, String shoujia) {
        super(pinpai, yanse, xinghao, shoujia);
    }

    public Dianshi(String chicun, String fenbianlui) {
        this.chicun = chicun;
        this.fenbianlui = fenbianlui;
    }

    public Dianshi(String pinpai, String yanse, String xinghao, String shoujia, String chicun, String fenbianlui) {
        super(pinpai, yanse, xinghao, shoujia);
        this.chicun = chicun;
        this.fenbianlui = fenbianlui;
    }

    public String getChicun() {
        return chicun;
    }

    public void setChicun(String chicun) {
        this.chicun = chicun;
    }

    public String getFenbianlui() {
        return fenbianlui;
    }

    public void setFenbianlui(String fenbianlui) {
        this.fenbianlui = fenbianlui;
    }
}
