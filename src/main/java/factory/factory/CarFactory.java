package factory.factory;

import factory.product.AirCondition;
import factory.product.Engine;

public interface CarFactory {
    public Engine createEngine();
    public AirCondition createAirCondition();
}
