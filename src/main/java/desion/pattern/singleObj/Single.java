package desion.pattern.singleObj;

public class Single {

    private final static Single single = new Single();

    public Single() {

    }

    public static Single single(){
        return single;
    }
}
