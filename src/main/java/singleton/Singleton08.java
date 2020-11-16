package singleton;

/**
 *  枚举
 *  1.使用枚举来实现单例模式，不仅能够避免多线程同步问题，而且还能防止反序列化重新创建对象
 *  2、推荐使用。
 */
public class Singleton08 {
    private Singleton08() {

    }
    private enum Singleton {
        INSTANCE;
        private final Singleton08 instance;
        Singleton() {
            instance = new Singleton08();
        }
        private Singleton08 getInstance() {
            return instance;
        }
    }
    public static Singleton08 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}
