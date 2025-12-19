package com.xiaoyudi.jc.dp.singleton;

public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(null == instance){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    //测试
    public static void main(String[] args) {
        for(int i = 0; i<100; i ++){
            new Thread(() ->{
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
