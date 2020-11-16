package factory.factory;

import factory.product.AirCondition;
import factory.product.AirConditionA;
import factory.product.Engine;
import factory.product.EngineA;

public class Bmw320Factory implements CarFactory{

    public Engine createEngine() {
        return new EngineA();
    }


    public AirCondition createAirCondition() {
        return new AirConditionA();
    }
}
