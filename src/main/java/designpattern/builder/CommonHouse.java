package designpattern.builder;

public class CommonHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println("build commonHouse basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("build commonHouse walls");
    }

    @Override
    public void roofed() {
        System.out.println("build commonHouse roofed");
    }

    @Override
    public void build() {
        super.build();
    }
}
