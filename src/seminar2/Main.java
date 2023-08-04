package seminar2;

import java.util.Arrays;

import static seminar2.HeapSort.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 2, 9, 3, 8, 4, 7, 6, 5};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
