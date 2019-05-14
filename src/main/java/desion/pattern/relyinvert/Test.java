package desion.pattern.relyinvert;


//依赖倒置
//高层模块不应该依赖低层模块，二者都应该依赖其抽象；
// 抽象不应该依赖细节；细节应该依赖抽象。

public class Test {

    public static void main(String[] args) {
        //高层模块就是Baron类，
        //Book，Newpapper都是低层模块
        //要降低底层模块和高层模块的耦合。
        // 在改动的时候，使高层模块变动最小，
        // 因此让Baron依赖于IReader接口，底层模块实现IReader接口

        //今天想读书
        IReader book = new Book();
        //今天想看报纸
        IReader newpapper = new Newspapper();
        Baron baron = new Baron(book);
        baron.action();

    }
}
