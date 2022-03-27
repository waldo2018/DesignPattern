package designpattern.builder.uml;

public class ConcreteBuilder implements Builder{

    @Override
    public void buildPartA() {

    }

    @Override
    public void buildPartB() {

    }

    @Override
    public void buildPartC() {

    }

    @Override
    public void buildPartD() {

    }

    @Override
    public void getResult() {
        buildPartA();
        buildPartB();
        buildPartC();
        buildPartD();
    }
}
