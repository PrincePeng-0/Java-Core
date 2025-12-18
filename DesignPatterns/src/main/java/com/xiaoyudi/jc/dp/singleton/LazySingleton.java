package com.xiaoyudi.jc.dp.singleton;

public class LazySingleton {

    private static volatile LazySingleton instance = new LazySingleton();

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            instance = getInstance();
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
