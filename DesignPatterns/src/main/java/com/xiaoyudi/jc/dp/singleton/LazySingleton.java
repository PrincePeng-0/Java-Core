package com.xiaoyudi.jc.dp.singleton;

public class LazySingleton {
    //使用volatile 防止cpu指令重排问题
    private static volatile LazySingleton instance;
    //创建私有构造函数， 防止外部new
    private LazySingleton(){}
    //获取单例对象， 使用双重检查提升性能
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
