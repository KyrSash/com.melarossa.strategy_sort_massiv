import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        int[] numbers = {5, -5, 100, 38, -100, 19, 13, -13, 22, 15};

        arraySort.setArraySorting(new BubbleStrategy());
        arraySort.setArraySorting(new SelectionStrategy());
        arraySort.setArraySorting(new QuicksortStrategy());

        arraySort.getSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
