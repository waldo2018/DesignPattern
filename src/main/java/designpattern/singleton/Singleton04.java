package designpattern.singleton;

/**
 *  饿汉式 - 线程安全，同步方法
 *  1、起到了lazy loading 的效果，解决了线程不安全的问题。
 *  2、效率太低了，每个线程获取类的实例的时候，执行getinstance（）方法都需要进行同步。而其实
 *     这个方法只需要执行一次就可以，后面想要获取实例，直接return 就行了。方法进行同步效率太低。
 *  3、在实际开发中，也不建议使用这种方式
 */
public class Singleton04 {

    private static Singleton04 singleton;

    private Singleton04(){

    }
    public static synchronized Singleton04 getInstance() {
        if(singleton == null) {
            singleton = new Singleton04();
        }
        return singleton;
    }
}
