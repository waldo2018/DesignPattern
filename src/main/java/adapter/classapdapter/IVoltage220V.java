package adapter.classapdapter;

public abstract class IVoltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("220v");
        return src;
    }
}
