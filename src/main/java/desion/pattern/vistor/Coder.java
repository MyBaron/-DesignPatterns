package desion.pattern.vistor;

public class Coder implements Element {

    private String name;
    private boolean linux;
    private boolean java;
    private boolean vue;
    private boolean python;


    public Coder(String name, boolean linux, boolean java, boolean vue, boolean python) {
        this.name = name;
        this.linux = linux;
        this.java = java;
        this.vue = vue;
        this.python = python;
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.vistor(this);
    }

    public boolean isLinux() {
        return linux;
    }

    public Coder setLinux(boolean linux) {
        this.linux = linux;
        return this;
    }

    public boolean isJava() {
        return java;
    }

    public Coder setJava(boolean java) {
        this.java = java;
        return this;
    }

    public boolean isVue() {
        return vue;
    }

    public Coder setVue(boolean vue) {
        this.vue = vue;
        return this;
    }

    public String getName() {
        return name;
    }

    public Coder setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isPython() {
        return python;
    }

    public Coder setPython(boolean python) {
        this.python = python;
        return this;
    }
}
