package desion.pattern.vistor;

public class ArchitechVistor implements Vistor {
    @Override
    public void vistor(Coder coder) {
        if (coder.isJava() && coder.isLinux() && coder.isVue() ) {
            System.out.println(String.format("%s 是一个架构师",coder.getName()));
        }
    }
}
