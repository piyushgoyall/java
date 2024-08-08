abstract class Toy {
    abstract void print();
}

public class p37_abs_class {
    public static void main(String[] args) {
        // one method to use abstract Toy class is to inherit Toy in another class and
        // then use it
        // Other method

        // Anonymous class (Terminate the anonymous class using a semicolon)
        Toy t1 = new Toy() {
            @Override
            void print() {
                System.out.println("print");
            }
        };

        t1.print();
    }
}
