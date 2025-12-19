package com.xiaoyudi.jc.dp.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
