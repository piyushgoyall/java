package p56_generics;
public class p1_generics {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Character[] charArray = { 'a', 'b', 'c', 'd' };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        String[] stringArray = { "A", "B", "C", "D" };

        printArray(intArray);
        printArray(charArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println();

        System.out.println(getFirstElem(intArray));
        System.out.println(getFirstElem(charArray));
        System.out.println(getFirstElem(doubleArray));
        System.out.println(getFirstElem(stringArray));
    }

    public static <Gen> void printArray(Gen[] arr) {
        for (Gen x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Gen> Gen getFirstElem(Gen[] arr) {
        return arr[0];
    }
}