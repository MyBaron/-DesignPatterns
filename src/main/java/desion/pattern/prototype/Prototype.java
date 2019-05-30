package desion.pattern.prototype;

public abstract class Prototype implements Cloneable{

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();

    }
}
