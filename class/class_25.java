import java.awt.Point;

public class class_25 {
    public class Circle {
        Point center = new Point();
        double radius;

        Circle() {
            center = null;
            radius = 0;
        }

        Circle(Point p, double r) {
            this.center = p;
            this.radius = r;
        }

        public double getArea() {
            return 3.14 * radius * radius;
        }

        public double getPerimeter() {
            return 2 * 3.14 * radius;
        }

        public void setRadius(double newRadius) {
            this.radius = newRadius;
        }

        public void setCenter(Point newCenter) {
            this.center = newCenter;
        }
    }

    public static void main(String[] args) {
        class_25 outer = new class_25(); // Create an instance of the outer class
        Point p = new Point(1, 2); // Create a Point object
        Circle c = outer.new Circle(p, 3); // Use the outer class instance to create an instance of the inner class

        // Print the circle's area and perimeter
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        // Set new values for radius and center
        c.setRadius(5);
        c.setCenter(new Point(4, 5));

        // Print the updated circle's area and perimeter
        System.out.println("Updated Area: " + c.getArea());
        System.out.println("Updated Perimeter: " + c.getPerimeter());
    }
}
