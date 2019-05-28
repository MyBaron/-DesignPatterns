package desion.pattern.builder;


/**
 * 抽象建造者
 * 定义建造过程
 */
public  interface Builder {
    // 安装主板
    Builder createMainBoard(String mainBoard) ;
    // 安装 cpu
    Builder createCpu(String cpu) ;
    // 安装硬盘
    Builder createhardDisk(String hardDisk) ;
    // 安装内存
    Builder createMemory(String memory) ;
    // 组成电脑
    Computer createComputer() ;
}
