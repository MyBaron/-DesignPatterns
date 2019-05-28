package desion.pattern.builder;

public class customer {

    public static void main(String[] args) {
        //指挥者
        Boss boss = new Boss();
        //具体实现者
        BuilderPerson builderPerson = new BuilderPerson();
        System.out.println(boss.setBuilder(builderPerson).build("I9 8400", "256G SSD", "微星xt987", "16G 金士顿"));
    }
}
