package com.xiaoyudi.jc.dp.singleton;

/**
 * 使用内部类的方式实现单例
 * 优点： 延迟加载模式，使用时初始化
 *
 */
public class InnerClassSingleton {
    //定义内部类
    private static class InnerClassSingletonHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
    //创建私有构造函数， 防止外部new
    private InnerClassSingleton(){}
    //获取单例对象
    public static InnerClassSingleton getInstance(){
        return InnerClassSingletonHolder.instance;
    }
}
