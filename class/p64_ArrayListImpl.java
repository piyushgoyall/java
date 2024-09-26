import java.util.Arrays;

public class p64_ArrayListImpl {
    private int[] elements;
    private int size = 0; // Current number of elements
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor to initialize with default capacity
    public p64_ArrayListImpl() {
        elements = new int[DEFAULT_CAPACITY];
    }

    // Method to add an element
    public void add(int element) {
        ensureCapacity();
        elements[size++] = element;
    }

    // Method to remove an element at a specific index
    public int remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = 0; // Clear the last element
        return removedElement;
    }

    // Method to get an element at a specific index
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return elements[index];
    }

    // Method to get the current size
    public int size() {
        return size;
    }

    // Method to check if the list contains a specific element
    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    // Method to ensure the internal array has enough capacity
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // Method to clear the list
    public void clear() {
        Arrays.fill(elements, 0, size, 0);
        size = 0;
    }

    public static void main(String[] args) {
        p64_ArrayListImpl list = new p64_ArrayListImpl();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Element at index 1: " + list.get(1)); // Output: 20
        System.out.println("Size: " + list.size()); // Output: 3

        list.remove(1);
        System.out.println("Element at index 1 after removal: " + list.get(1)); // Output: 30
        System.out.println("Size after removal: " + list.size()); // Output: 2

        System.out.println("Contains 10? " + list.contains(10)); // Output: true
        System.out.println("Contains 20? " + list.contains(20)); // Output: false
    }
}

// import java.util.Arrays;

// public class p64_ArrayListImpl<T> {
// private Object[] elements;
// private int size = 0; // Current number of elements
// private static final int DEFAULT_CAPACITY = 10;

// // Constructor to initialize with default capacity
// public p64_ArrayListImpl() {
// elements = new Object[DEFAULT_CAPACITY];
// }

// // Method to add an element
// public void add(T element) {
// ensureCapacity();
// elements[size++] = element;
// }

// // Method to remove an element at a specific index
// @SuppressWarnings("unchecked")
// public T remove(int index) {
// if (index >= size || index < 0) {
// throw new IndexOutOfBoundsException("Invalid index");
// }
// T removedElement = (T) elements[index];
// for (int i = index; i < size - 1; i++) {
// elements[i] = elements[i + 1];
// }
// elements[--size] = null; // Clear the last element
// return removedElement;
// }

// // Method to get an element at a specific index
// @SuppressWarnings("unchecked")
// public T get(int index) {
// if (index >= size || index < 0) {
// throw new IndexOutOfBoundsException("Invalid index");
// }
// return (T) elements[index];
// }

// // Method to get the current size
// public int size() {
// return size;
// }

// // Method to check if the list contains a specific element
// public boolean contains(T element) {
// for (int i = 0; i < size; i++) {
// if (elements[i].equals(element)) {
// return true;
// }
// }
// return false;
// }

// // Method to ensure the internal array has enough capacity
// private void ensureCapacity() {
// if (size == elements.length) {
// int newCapacity = elements.length * 2;
// elements = Arrays.copyOf(elements, newCapacity);
// }
// }

// // Method to clear the list
// public void clear() {
// Arrays.fill(elements, 0, size, null);
// size = 0;
// }

// public static void main(String[] args) {
// p64_ArrayListImpl<Integer> list = new p64_ArrayListImpl<>();
// list.add(10);
// list.add(20);
// list.add(30);

// System.out.println("Element at index 1: " + list.get(1)); // Output: 20
// System.out.println("Size: " + list.size()); // Output: 3

// list.remove(1);
// System.out.println("Element at index 1 after removal: " + list.get(1)); //
// Output: 30
// System.out.println("Size after removal: " + list.size()); // Output: 2

// System.out.println("Contains 10? " + list.contains(10)); // Output: true
// System.out.println("Contains 20? " + list.contains(20)); // Output: false
// }
// }
