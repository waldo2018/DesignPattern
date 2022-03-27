package designpattern.bridge;

/**
 * 桥接模式
 * 1、实现了抽象和实现部分的分离，从而极大的提供的系统的灵活性。让抽象部分和实现部分独立开来，有助于系统进行分析层设计。
 * 2、对系统的高层部分，只需要直到抽象部分和实现部分的接口就可以了，其他的部分由具体业务来实现。
 * 3、桥接模式替代多层继承方案，可以减少子类的个数，降低了系统的管理和维护成本。
 * 4、桥接模式的引入增加了系统的理解和设计难度，由于聚合关系建立在抽象层，要求开发这对抽象进行设计和编程。
 * 5、桥接模式哟球正确识别出系统中两个独立变化的维度抽象和实现，因此其使用范围有一定的局限性，即需要有这样的使用场景、
 */
public class Client {
    public static void main(String[] args) {
        FolderPhone folderPhone = new FolderPhone(new Brand() {
            @Override
            public void open() {
                System.out.println("小米");
            }

            @Override
            public void close() {
                System.out.println("小米");
            }

            @Override
            public void call() {
                System.out.println("小米");
            }
        });
    }

}
