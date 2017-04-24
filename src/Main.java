public class Main {

    static int comparison_counter = 0;
    static int assignment_counter = 0;

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        java.util.Random r = new java.util.Random();
        int total = 0;
        int K = 100;
        int M = 1000;
        int[] input = r.ints(0, K).limit(10000).toArray();
        quickSort.sort(input, M);
        System.out.println("Value of comparison counter is " + comparison_counter);
        System.out.println("Value of assignment counter is " + assignment_counter);
        total = comparison_counter + assignment_counter;
        System.out.println("Total = " + total);
    }
}
