package builder.uml;

public class Director {

    Builder builder;
    public void construct() {
        builder.getResult();
    }
}
