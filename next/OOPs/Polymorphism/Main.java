package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Sqaure();

        s.area();
        circle.area();
        triangle.area();
        square.area();

        // Here if you remove 
    }
}