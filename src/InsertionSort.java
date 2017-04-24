/**
 * Created by Mithun on 4/23/2017.
 */
public class InsertionSort {

    public void sort(int[] input, int left, int right) {
        int temp;
        for (int i = left; i <= right; i++) {
            Main.comparison_counter++;
            for (int j = i; j > left; j--) {
                Main.comparison_counter++;
                if (input[j] < input[j - 1]) {
                    Main.assignment_counter++;
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }

    }
}
