public class ArraySort {
    private ArraySorting arraySorting;

    public void setArraySorting(ArraySorting arraySorting) {
        this.arraySorting = arraySorting;
    }

    public void getSort(int[] arr) {
        arraySorting.sortArray(arr);
    }
}
