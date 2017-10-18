package com.xteam.tourismpay.common;

public enum PayWay {
    WeiXin(1)
    ,ZhiFuBao(2)
    ,WangYin(3)
    ;
    private  int way;

    PayWay(int way) {
        this.way = way;
    }

    public  static PayWay valueOf(int way){
        switch (way){
            case 1:
                return WeiXin;
            case 2:
                return ZhiFuBao;
            case 3:
                return WangYin;
        }
        return null;
    }

    public int value(){
        return this.way;
    }
}
