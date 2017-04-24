import java.util.Arrays;

/**
 * Created by Mithun on 4/23/2017.
 */
public class QuickSort {

    private int array[];
    private int length;
    int M = 0;

    public void sort(int[] inputArr, int receivedM) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        M = receivedM;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        if ((j - i) < M) {
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(array, i, j);
        } else {
            // calculate pivot number, I am taking pivot as middle index number
            int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
            while (i <= j) {
                while (array[i] < pivot) {
                    Main.comparison_counter++;
                    i++;
                }
                while (array[j] > pivot) {
                    Main.comparison_counter++;
                    j--;
                }
                if (i <= j) {
                    Main.assignment_counter++;
                    exchangeNumbers(i, j);
                    i++;
                    j--;
                }
            }
            if (lowerIndex < j)
                quickSort(lowerIndex, j);
            if (i < higherIndex)
                quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
