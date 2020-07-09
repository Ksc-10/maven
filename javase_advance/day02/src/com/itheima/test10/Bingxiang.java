package com.itheima.test10;

public class Bingxiang extends Dianqi{
    private String kuanshi;
    private String zhileng;

    public Bingxiang() {
    }

    public Bingxiang(String pinpai, String yanse, String xinghao, String shoujia) {
        super(pinpai, yanse, xinghao, shoujia);
    }

    public Bingxiang(String kuanshi, String zhileng) {
        this.kuanshi = kuanshi;
        this.zhileng = zhileng;
    }

    public Bingxiang(String pinpai, String yanse, String xinghao, String shoujia, String kuanshi, String zhileng) {
        super(pinpai, yanse, xinghao, shoujia);
        this.kuanshi = kuanshi;
        this.zhileng = zhileng;
    }

    public String getKuanshi() {
        return kuanshi;
    }

    public void setKuanshi(String kuanshi) {
        this.kuanshi = kuanshi;
    }

    public String getZhileng() {
        return zhileng;
    }

    public void setZhileng(String zhileng) {
        this.zhileng = zhileng;
    }
}
