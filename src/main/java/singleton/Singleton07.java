package singleton;


/**
 *  静态内部类
 *  1、 这种方式采用类装载的机制来保证初始化实例只有一个线程。
 *  2、 静态内部类方式在Singleton类被装载的时候并不会立即实例化，而是在需要实例化时，调用getInstance方法，
 *      才会装载SingletonInstance类，从而完成Singleton的实例化。
 *  3、类的静态属性只会在第一次加载类的时候初始化，所以在这里，jvm帮助我们保证了线程的安全性，在类进行初始化时，
 *      别的线程时无法进入的。
 *  4、避免了线程不安全，利用静态内部类的特点来实现延迟加载，效率高。
 *  5、推荐使用。
 */
public class Singleton07 {
    private Singleton07(){

    }
    private static class SingletonInstance {
        private static final Singleton07 singleton = new Singleton07();
    }

    public Singleton07 getInstance() {
        return SingletonInstance.singleton;
    }

}
