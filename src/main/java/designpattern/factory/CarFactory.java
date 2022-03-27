package designpattern.factory;

import designpattern.product.AirCondition;
import designpattern.product.Engine;

public interface CarFactory {
    public Engine createEngine();
    public AirCondition createAirCondition();
}
