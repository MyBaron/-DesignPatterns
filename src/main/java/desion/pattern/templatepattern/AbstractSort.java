package desion.pattern.templatepattern;

public abstract class AbstractSort {

    public abstract void sort(int[] array);

    public void show(int[] array){
        this.sort(array);
        System.out.print("排序结果：");
        for (int i = 0; i < array.length; i++){
            System.out.printf("%5s", array[i]);
        }
    }
}
