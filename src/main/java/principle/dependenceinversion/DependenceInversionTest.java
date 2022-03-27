package principle.dependenceinversion;

/**
 * 依赖倒置原则
 * 原始定义：高层模块不应该依赖于低层模块，两者都应该依赖于其抽象。
 * 以下的实现方式，采用面向接口编程的。
 * mvc 三层结构中，控制层和服务层时采用接口的形式连接，也是体现这种原则。我们修改低层的代码的时候，并不会对依赖其的代码产生
 * 影响。
 *
 */
public class DependenceInversionTest {
    public static void main(String[] args) {
        Customer1 c1 = new Customer1();
        c1.goShopping(new Shop3());
        c1.goShopping(new Shop4());
    }
}

class Customer1 {
    public void goShopping(Shop shop) {
        shop.shopping();
    }
}

interface Shop {
    void shopping();
}

class Shop3 implements Shop {
    @Override
    public void shopping() {
        System.out.println("购物3");
    }
}

class Shop4 implements Shop {
    @Override
    public void shopping() {
        System.out.println("购物4");
    }
}