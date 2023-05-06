//Practise Set 2
public class Nth {

    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;

    }

    public static void main(String[] args) {
        // I will use CLA as size of array

        int[] arr = { 4, 5, 1, 2, 8, 6, 7, 9, 88, 92, 3 };
        arr = bubbleSort(arr);
        int n = Integer.parseInt(args[0]);
        System.out.println("Nth smallest Element " + arr[n - 1]);
        System.out.println("Nth Largest Element " + arr[arr.length - n]);
        // Here I will print element count from 1 , not 0
    }
}