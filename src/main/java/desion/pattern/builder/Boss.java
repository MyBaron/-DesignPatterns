package desion.pattern.builder;

/**
 * Director 角色 指挥者
 * 调用方只需要跟该角色进行交互就可以获取到想要的对象
 */
public class Boss {

    private Builder builder;

    public Boss setBuilder(Builder builder) {
        this.builder = builder;
        return this;
    }

    public Computer build(String cpu,String hardDisk,String mainBoard,String memory){
        return builder.createCpu(cpu)
                .createhardDisk(hardDisk)
                .createMainBoard(mainBoard)
                .createMemory(memory)
                .createComputer();
    }
}
