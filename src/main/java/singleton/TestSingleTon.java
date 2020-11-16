package singleton;

import org.junit.Test;

public class TestSingleTon {

    @Test
    public void test01(){
        Singleton01 instance = Singleton01.getInstance();
        System.out.println(instance);
    }
    @Test
    public void test() {
        Singleton02 singleTon02 = Singleton02.getInstance();
        System.out.println(singleTon02);
    }
    @Test
    public void test08(){
        Singleton08 singleton08 = Singleton08.getInstance();
        System.out.println(singleton08);
    }

}
