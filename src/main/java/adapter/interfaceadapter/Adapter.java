package adapter.interfaceadapter;

/**
 * 适配器模式或者是缺省适配器模式
 * 1、核心思路：当不需要全部实现接口提供的方法时，可以先设计一个抽象类实现接口，并为接口中每个方法提供一个默认的
 * 实现，那么改抽象类的子类可以有选择行的覆盖父类的某些方法来实现需求。
 * 2、使用于一个接口不想使用其所有的方法的情况。
 */
public abstract class Adapter implements Interface1{
    public void m1() {

    }

    public void m2() {

    }

    public void m3() {

    }

    public void m4() {

    }
}
