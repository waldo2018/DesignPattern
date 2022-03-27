package principle.isp;

/**
 * 接口隔离原则
 * 要为各个类建立它们需要的专用接口，而不要试图去建立一个很庞大的接口共所有依赖它的类去调用。
 * * 单一职责原则注重的是职责，而接口隔离原则注重的对接口依赖的隔离。
 * * 单一职责原则主要约束类，它针对的是程序中的实现和细节；接口隔离原则主要约束接口，主要是对抽象和程序框架的架构。
 * 
 * 接口隔离原则的优点
 * 1.将臃肿庞大的接口分解为多个粒度小的接口，可以预防外来变更的扩散，提高系统的灵活性和可维护性。
 * 2.接口隔离提高了系统的内聚性，减少了对外交互，降低了系统的耦合性。
 * 3.如果接口的粒度大小合理，能够保证系统的稳定性。但是，如果定义过小，则会造成接口数量过多，是设计复杂化。如果定义太多，会降低
 *   系统的灵活性。无法提供定制服务，给整体项目带来无法预料的风险。
 * 4.使用多个专门的接口，还能够体现对象的层次，因为可以通过对接口的继承，实现对总接口的定义。
 * 5.能够减少项目工程中的代码冗余。过大的接口里面通常放置许多不用的方法，实现这些接口时被迫设计冗余的方法。
 * 
 * 接口隔离的实现方法
 * 1.接口尽量小，但是要有限度。一个接口只服务于一个子模块或业务逻辑。
 * 2.为依赖接口的类定制服务。只提供调用者需要的方法，屏蔽不需要的方法。
 * 3.了解环境，拒绝盲从。每个项目都有所选定的环境因素，环境不同，接口拆分的标准就不同。要深入了解业务逻辑。
 * 4.提高内聚，减少对外交互。使接口用最少的方法完成最多的事情。
 */
public class ISPTest {
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
        //print.delete();
    }
}

// 输入模块
interface InputModule {
    void insert();
    void delete();
    void modify();
}

// 统计模块
interface CountModule {
    void countTotalScore();
    void countAverage();
}

// 打印模块
interface PrintModule {
    void printStuInfo();
    void queryStuInfo();
}

// 学生成绩列表
class StuScoreList implements InputModule, CountModule, PrintModule {

    private StuScoreList() {

    }

    public static InputModule getInputModule(){
        return (InputModule)new StuScoreList();
    }
    public static CountModule getCountModule(){
        return (CountModule)new StuScoreList();
    }

    public static PrintModule getPrintModule(){
        return (PrintModule)new StuScoreList();
    }
    @Override
    public void insert() {
        System.out.println("输入模块的insert方法被调用");
    }

    @Override
    public void delete() {
        System.out.println("输入模块的delete方法被调用");
    }

    @Override
    public void modify() {
        System.out.println("输入模块的modify方法被调用");
    }

    @Override
    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore方法被调用");
    }

    @Override
    public void countAverage() {
        System.out.println("统计模块的countAverage方法被调用");
    }

    @Override
    public void printStuInfo() {
        System.out.println("打印方法的printStuInfo被调用");
    }

    @Override
    public void queryStuInfo() {
        System.out.println("打印方法的queryStuInfo方法被调用");
    }
}