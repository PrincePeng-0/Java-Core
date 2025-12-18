package com.xiaoyudi.jc.dp.singleton;

/**
 * 饿汉式单例模式的实现
 * 优点：在内存中加载时就创建，因此是线程安全的
 * 缺点：扩展性差，违背开闭原则，多线程下调试困难
 */
public class HungrySingleton {
    //初始化HungrySingleton 对象
    private static final HungrySingleton instance = new HungrySingleton();
    //创建私有构造函数， 防止外部new HungrySingleton 对象
    protected HungrySingleton(){}
    //获取单例对象
    public static HungrySingleton getInstance(){
        return instance;
    }

    //测试
    public static void main(String[] args) {
        for(int i = 0; i<100; i ++){
            new Thread(() ->{
                try {
                    Thread.sleep(1000);
                    System.out.println(getInstance().hashCode());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
