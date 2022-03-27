package principle.isp;

/**
 * 接口隔离原则
 * 要为各个类建立它们需要的专用接口，而不要试图去建立一个很庞大的接口共所有依赖它的类去调用。
 * * 单一职责原则注重的是职责，而接口隔离原则注重的对接口依赖的隔离。
 * * 单一职责原则主要约束类，它针对的是程序中的实现和细节；接口隔离原则主要约束接口，主要是对抽象和程序框架的架构。
 * 
 * 接口隔离原则的优点
 * 1.
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