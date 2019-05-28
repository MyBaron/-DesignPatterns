package desion.pattern.builder;


/**
 * 具体实现建造的类
 */
public class BuilderPerson implements Builder {

    private Computer computer = new Computer();

    @Override
    public Builder createMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
        return this;
    }

    @Override
    public Builder createCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public Builder createhardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
        return this;
    }

    @Override
    public Builder createMemory(String memory) {
        computer.setMemory(memory);
        return this;
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
