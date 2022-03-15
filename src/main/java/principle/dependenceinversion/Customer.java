package principle.dependenceinversion;

/**
 * 这种实现方式，在每次添加新的商店购物的时候，都要重新修改Customer的方法。
 * 显然，违背了开闭原则。对扩展开放，对修改关闭。
 * 修改方式：重新设计shop类，为其创建一个父类shop，可以直接在customer中调用shop而不是具体的商店。
 * 具体的商店继承shop 接口。 即依赖倒转原则
 * 面向接口编程，而不是面向实现编程。
 */
public class Customer {
    public void goShop(Shop1 shop1) {
        shop1.shopping();
    }
}

class Shop1 {
    public void shopping() {
        System.out.println("购物1");
    }
}

class Shop2 {
    public void shopping() {
        System.out.println("购物2");
    }
}