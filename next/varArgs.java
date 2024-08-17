import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(); // Calling func with no arguments
        func(1, 2, 3); // Calling func with some arguments for demonstration
    }

    static void func(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
