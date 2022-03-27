package designpattern.builder;

/**
 * 使用传统方式建房的问题分析
 * 1、比较容易理解，简易操作。
 * 2、设计的程序结构简单，没有设置缓冲层，程序的扩展和维护不好。也就是说，这种设计方案，将产品和创建产品的过程封装在了一起。耦合性增强。
 * 3、解决方案：将产品和产品建造过程进行解耦  ---建造者模式
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
