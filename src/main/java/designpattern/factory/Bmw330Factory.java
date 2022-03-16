package designpattern.factory;

import designpattern.product.AirCondition;
import designpattern.product.AirConditionB;
import designpattern.product.Engine;
import designpattern.product.EngineB;

public class Bmw330Factory implements CarFactory{

    public Engine createEngine() {
        return new EngineB();
    }


    public AirCondition createAirCondition() {
        return new AirConditionB();
    }
}
