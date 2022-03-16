package designpattern.singleton;

/**
 *  饿汉式- 静态常量
 *  1）优点：结构比较简单，在类装载的过程中完成实例化。避免了线程同步的问题。
 *  2）缺点：在类装载的时候完成实例化，并未达到lazy loading的效果，如果从开始到结束都没有用到该实例，
 *          会造成资源的浪费。
 *  3)结论: 可以使用，可能造成内存浪费。
 */
public class Singleton01 {
    // 私有化构造器，防止直接创建对象
    private Singleton01() {

    }
    // 在类的内部先创建一个SingleTon01对象
    private static Singleton01 instance = new Singleton01();

    // 对外提供静态方法，获取内部生成是静态实例。
    public static Singleton01 getInstance() {
        return instance;
    }
}
