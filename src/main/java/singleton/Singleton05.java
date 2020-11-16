package singleton;

/**
 *  懒汉式 - 线程安全，同步代码块
 *  1、这种方式，是对懒汉式 - 线程安全，同步方法的改进。因为同步方法的执行效率太低，改用同步产生实例话的同步代码块。
 *  2、但是并不能实现线程同步的作用。
 *  3、 在实际开发中，不能使用这种方式。
 */
public class Singleton05 {
    private static Singleton05 singleton;
    private Singleton05(){}
    public static Singleton05 getInstance() {
        if(singleton == null) {
            synchronized (Singleton05.class) {
                singleton = new Singleton05();
            }
        }
        return singleton;
    }
}
