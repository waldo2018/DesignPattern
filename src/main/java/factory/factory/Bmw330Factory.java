package factory.factory;

import factory.product.AirCondition;
import factory.product.AirConditionB;
import factory.product.Engine;
import factory.product.EngineB;

public class Bmw330Factory implements CarFactory{

    public Engine createEngine() {
        return new EngineB();
    }


    public AirCondition createAirCondition() {
        return new AirConditionB();
    }
}
