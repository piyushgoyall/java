import java.util.Scanner;
import java.util.Random;

public class p67_QuickSort {

    public static void printArray(int[] arr, int arrSize) {
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int choosePivot(int left, int right) {
        Random rand = new Random();

        // Pick 3 random numbers within the range of the array
        int i1 = left + rand.nextInt(right - left + 1);
        int i2 = left + rand.nextInt(right - left + 1);
        int i3 = left + rand.nextInt(right - left + 1);

        // Return their median
        return Math.max(Math.min(i1, i2), Math.min(Math.max(i1, i2), i3));
    }

    public static int partition(int[] arr, int left, int right) {
        int pivotInd = choosePivot(left, right); // Index of pivot
        int temp = arr[right];
        arr[right] = arr[pivotInd];
        arr[pivotInd] = temp; // Put the pivot at the end
        int pivot = arr[right]; // Pivot
        int i = (left - 1); // All elements less than or equal to pivot go before or at i

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] <= pivot) {
                i++; // Increment the index
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp; // Putting the pivot back in place
        return (i + 1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // pi is where the pivot is at
            int pi = partition(arr, left, right);

            // Separately sort elements before and after partition
            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the size of the array: ");
        int arrSize = sc.nextInt();

        // Declare array
        int[] arr = new int[arrSize];

        // Take input for array elements
        System.out.println("Enter " + arrSize + " elements:");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        // Call quickSort function
        quickSort(arr, 0, arrSize - 1);

        // Print sorted array
        System.out.print("Sorted array: ");
        printArray(arr, arrSize);

        sc.close();
    }
}
