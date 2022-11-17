import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 7, 1, 3, 6, 6, 16, 0};
        System.out.println("Sample array before sorting: " + Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.print("Array after insertion soring: " + Arrays.toString(arr));
    }
}
