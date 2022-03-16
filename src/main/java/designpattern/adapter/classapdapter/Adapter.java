package designpattern.adapter.classapdapter;

/**
 * 类适配器模式
 * 1、Java是单继承机制，所以类适配器需要继承src类这一点算是缺点，因为这要求dst必须是接口，有一定的局限性。
 * 2、src类的方法在adapter中都会暴露出来，也增加了使用成本。
 * 3、由于其继承了src 类，所以它可以根据需求重写src类的方法，是得adaper的灵活性增加了。
 */
public class Adapter extends IVoltage220V implements IVoltage5v{

    public int output5V() {
        int srcV = output220V();
        int dstV = srcV/44;
        return dstV;
    }
}
