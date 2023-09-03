import java.util.Scanner;

public class MergeSort2 {
    public static void merge(int[] arr, int l, int m, int r) {
        // merge implementation
        // ...
    }

    public static void mergeSort(int[] arr, int l, int r) {
        // mergeSort implementation
        // ...
    }

    public static void printArray(int[] arr) {
        // printArray implementation
        // ...
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Given Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);

        scanner.close();
    }
}