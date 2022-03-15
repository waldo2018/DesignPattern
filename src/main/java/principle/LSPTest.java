package principle;

/**
 * 里式替换原则
 * 子类在继承父类的功能时，除了添加功能，不可修改父类原有功能。
 * 。
 */
public class LSPTest {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiwi();
        bird1.setFlySpeed(200);
        bird2.setFlySpeed(100);
        System.out.println("if flying 300 ");
        try{
            System.out.println("Swallow " + bird1.getFlyTime(300));
            System.out.println("BrownKiwi "  + bird2.getFlyTime(300));
        } catch (Exception e){
            System.out.println("something wrong");
        }
    }
}

class Bird {
    double flySpeed;
    public void setFlySpeed(double speed){
        flySpeed = speed;
    }
    public double getFlyTime(double distance) {
        return distance / flySpeed;
    }
}

class Swallow extends Bird {

}

class BrownKiwi extends Bird {
    @Override
    public void setFlySpeed(double speed) {
        flySpeed = 0;
    }
}
