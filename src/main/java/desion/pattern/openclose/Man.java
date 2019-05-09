package desion.pattern.openclose;

public class Man implements Person {
    private int age;
    @Override
    public void eat() {
        System.out.println("每天都要吃饭");
    }

//    如果吃饭前需要添加个洗手的方法，那么不应该在Person里添加，
//    而是在Man类或者新建一个类继承Man来实现
//    此处就在Man类中实现
    public void washinghands() {
        System.out.println("要洗手");
    }
}
