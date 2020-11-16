package singleton;

/**
 *  饿汉式 - 静态代码块
 *  1） 与静态常量实现类似，都是在类加载的时候进行实例化，优缺点跟静态常量实现类似。有可能造成内存浪费。
 */
public class Singleton02 {

    private static Singleton02 instance;
    // 在静态代码执行的时候，创建单例对象
    static {
        instance = new Singleton02();
    }
    private Singleton02() {}

    public static Singleton02 getInstance() {
        return instance;
    }
}
