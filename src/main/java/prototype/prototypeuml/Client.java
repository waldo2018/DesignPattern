package prototype.prototypeuml;

import prototype.deepclone.DeepCloneableTarget;
import prototype.deepclone.DeepProtoType;

public class Client {
    //    Sheep sheep = new Sheep("tom", 1, "white");
//
//    Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(),sheep.getColor());
//
//    Sheep sheep2 = (Sheep)sheep.clone();
//    Sheep sheep3 = (Sheep)sheep.clone();
//    Sheep sheep4 = (Sheep)sheep.clone();
//    Sheep sheep5 = (Sheep)sheep.clone();
//    Sheep sheep6 = (Sheep)sheep.clone();
    public static void main(String[] args) throws CloneNotSupportedException {

        // 浅拷贝
//        System.out.println("原型模式完成对象的创建");
//
//        Sheep sheep = new Sheep("tom", 1, "white");
//        Sheep sheep2 = (Sheep) sheep.clone();
//        Sheep sheep3 = (Sheep) sheep.clone();
//        Sheep sheep4 = (Sheep) sheep.clone();
//        Sheep sheep5 = (Sheep) sheep.clone();
//        Sheep sheep6 = (Sheep) sheep.clone();
//        // sheep2.friend 为 null 空指针异常。
//        System.out.println("sheep2=" + sheep2 + "sheep2.friend" + sheep2.friend.hashCode() );

        // 深拷贝
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "tom";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("zhansan", "lisi");

        // 采用重写clone 方法的方式进行深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType1);
        // 采用序列化的方式进行深拷贝 推荐
        DeepProtoType deepProtoType2 = (DeepProtoType)deepProtoType.deepClone();
        System.out.println(deepProtoType2);

    }
}
