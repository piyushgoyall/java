package OOPs.Polymorphism;

public class Triangle extends Shapes {
    @Override
    public void area() {
        System.out.println("Area is : √[s * (s - a) * (s - b) * (s - c)]");
    }
}
