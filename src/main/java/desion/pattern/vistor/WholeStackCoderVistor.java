package desion.pattern.vistor;

public class WholeStackCoderVistor implements Vistor {
    @Override
    public void vistor(Coder coder) {
        if (coder.isJava() && coder.isLinux() && coder.isVue() && coder.isPython()) {
            System.out.println(String.format("%s 是一个全栈工程师",coder.getName()));
        }
    }
}
