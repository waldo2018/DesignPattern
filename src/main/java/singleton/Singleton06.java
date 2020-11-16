package singleton;

/**
 *  懒汉式 - 线程安全，双重检查
 *  1、double-check概念是在多线程开发中常用的方式，如代码所示，我们进行了两次null的check 这种就可以保证线程安全了。
 *  2、实例化代码只执行一次，后面再次访问的时候，判断null 之后可以直接返回实例对象。避免反复进行方法同步。
 *  3、线程安全，延迟加载，效率较高。
 *  4、 在实际开发中，推荐使用这种单例模式。
 */
public class Singleton06 {
    private static Singleton06 singleton;
    private Singleton06(){}
    public static Singleton06 getInstance() {
        if(singleton == null) {
            synchronized (Singleton06.class) {
                if (singleton == null) {
                    singleton = new Singleton06();
                }
            }
        }
        return singleton;
    }
}
