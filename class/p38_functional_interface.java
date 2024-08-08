interface Vehicle {
    int accelerate(int speed);
}

public class p38_functional_interface {
    public static void main(String[] args) {
        Vehicle v1 = (x) -> x;
        System.out.println(v1.accelerate(20));
    }
}