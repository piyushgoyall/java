import java.util.Scanner;

public class p66_MergeSort {

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] leftPart = new int[leftSize];
        int[] rightPart = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftPart[i] = arr[start + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightPart[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;

        while (i < leftSize && j < rightSize) {
            if (leftPart[i] <= rightPart[j]) {
                arr[k] = leftPart[i];
                i++;
            } else {
                arr[k] = rightPart[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftPart[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightPart[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, size - 1);
        printArray(arr, size);
    }
}
