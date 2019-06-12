package desion.pattern.vistor;

/**
 * 访问者模式
 *
 * 多变化的访问者
 * 少变化的元素
 */
public interface Vistor {

    void vistor(Coder coder);
}
