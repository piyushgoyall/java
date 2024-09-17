/*
    Inheritance V **Class : Circle and ResizableCircle**

    You are given:
    - an interface called GeometricObject, which declares two abstract methods: getPerimeter() and getArea() and
    - an interface Resizable declares an abstract method resize(), which modifies the dimension (such as radius) by the given percentage.
 */

interface GeometricObject {
    public double getPerimeter();

    public double getArea();
}

interface Resizable {
    public void resize(int percent);
}

/*
 * You have to write the implementation of class Circle, with a protected
 * variable radius, which implements the interface GeometricObject.
 * It includes an parameterized constructor to initialize radius, and class
 * ResizableCircle as a subclass of the class Circle, which also
 * implements the interface Resizable. Both your classes must have an method
 * called toString() which returns an
 * string in the format shown below: - Circle[radius=value]
 * ​
 * Sample Input
 * 1 // radius of circle
 * 2 // radius of resizable circle
 * 200 // percentage to resize the circle
 * 
 */

/*
 * Sample Output:
 * Circle[radius=1.0] // Print the circle
 * 6.28 // Perimeter of circle
 * 3.14 // Area of circle
 * Circle[radius=2.0]
 * 12.57 // Perimeter of circle
 * 12.57 // Area of circle
 * 25.13 // Perimeter of circle after resize
 * 50.27 // Area of circle after resize
 * 
 */

class Circle implements GeometricObject {
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        double ans = 2 * radius * Math.PI;
        return ans;
    }

    public double getArea() {
        double ans = radius * radius;
        return ans * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

class ResizableCircle extends Circle implements Resizable {
    ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        double factor = percent / 100.0;
        radius = radius * factor;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

public class p2 {
    public static void main(String[] args) {
        // Create a regular Circle
        Circle circle = new Circle(5.0);
        System.out.println(circle); // Display the circle
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        // Create a ResizableCircle
        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println(resizableCircle); // Display the circle
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        // Resize the resizableCircle by 50%
        resizableCircle.resize(50);
        System.out.println("After resizing by 50%:");
        System.out.println(resizableCircle); // Display the resized circle
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
    }
}
