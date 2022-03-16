package designpattern.builder.improve;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
       house.setBase("build commonHouse base");
    }

    @Override
    public void buildWalls() {
        house.setWall("build commonHouse wall");
    }

    @Override
    public void roofed() {
        house.setRoofed("build common roofed");
    }

    @Override
    public House buildHouse() {
        return super.buildHouse();
    }
}
