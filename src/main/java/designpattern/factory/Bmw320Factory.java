package designpattern.factory;

import designpattern.product.AirCondition;
import designpattern.product.AirConditionA;
import designpattern.product.Engine;
import designpattern.product.EngineA;

public class Bmw320Factory implements CarFactory{

    public Engine createEngine() {
        return new EngineA();
    }


    public AirCondition createAirCondition() {
        return new AirConditionA();
    }
}
