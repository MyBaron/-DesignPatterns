package desion.pattern.templatepattern;

public class Test {

    public static void main(String[] args) {
        AbstractSort abstractSort = new ConcreteSort();
        int[] array = new int[]{99, 123, 4, 12, 3, 48, 2};
        abstractSort.show(array);
    }
}
