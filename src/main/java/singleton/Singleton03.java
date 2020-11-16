package singleton;

/**
 *  饿汉式 - 线程不安全
 *  1、起到了lazy loading 的效果，但是只能够在单线程下使用。
 *  2、如果在多线程下使用，一个线程进入了if（singleton == null)判断语句块，但是还没有来得及创建实例，
 *     另一个线程也通过了该判断语句，这时便会产生多个实例。所以在多线程环境下不可以使用这种方式。
 *  3、在实际开发中，不建议使用这种方式
 */
public class Singleton03 {

    private static Singleton03 singleton;

    private Singleton03(){

    }
    public static Singleton03 getInstance() {
        if(singleton == null) {
            singleton = new Singleton03();
        }
        return singleton;
    }
}
