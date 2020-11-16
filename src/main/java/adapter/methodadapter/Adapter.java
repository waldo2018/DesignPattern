package adapter.methodadapter;

import adapter.classapdapter.IVoltage5v;

/**
 * 对象适配器模式
 * 1、跟类适配器模式相似，但是实现方式不同。使用更加灵活
 *
 */

public class Adapter implements IVoltage5v {

    private IVoltage220V iVoltage220V;

    public Adapter(IVoltage220V iVoltage220V) {
        this.iVoltage220V = iVoltage220V;
    }

    public int output5V() {
        int srcV = iVoltage220V.output220V();
        int dstV = srcV/44;
        return dstV;
    }
}
