package desion.pattern.vistor;

public class Test {

    public static void main(String[] args) {
        Coder baron = new Coder("baron", true, true, true, false);
        Coder json = new Coder("json", true, true, true, true);
        ArchitechVistor architechVistor = new ArchitechVistor();
        architechVistor.vistor(baron);
        WholeStackCoderVistor wholeStackCoderVistor = new WholeStackCoderVistor();
        wholeStackCoderVistor.vistor(json);
    }
}
