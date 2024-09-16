/*
 * 3. Constructor Overloading
 * Write a Java program to create a class called "p1" with instance variables
 * title, author, and price. Implement a default constructor and two
 * parameterized constructors:
 * 
 * One constructor takes title and author as parameters.
 * The other constructor takes title, author, and price as parameters.
 * Print the values of the variables for each constructor.
 */

public class p1 {
    private String title;
    private String author;
    private int price;

    public p1() {
        this.title = "Anonymous";
        this.author = "Anonymous";
        this.price = 0;
    }

    public p1(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    public p1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        p1 book1 = new p1();
        // Print the values of the instance variables for book1
        System.out.println("Book1 Title: " + book1.title);
        System.out.println("Book1 Author: " + book1.author);
        System.out.println("Book1 Price: " + book1.price);

        // Create a new p1 object using the parameterized constructor (title, author)
        p1 book2 = new p1("Amatka", "Karin Tidbeck");
        // Print the values of the instance variables for book2
        System.out.println("Book2 Title: " + book2.title);
        System.out.println("Book2 Author: " + book2.author);
        System.out.println("Book2 Price: " + book2.price);

        // Create a new p1 object using the parameterized constructor (title, author,
        // price)
        p1 book3 = new p1("Altered Carbon", "Richard K. Morgan", 18);
        // Print the values of the instance variables for book3
        System.out.println("Book3 Title: " + book3.title);
        System.out.println("Book3 Author: " + book3.author);
        System.out.println("Book3 Price: " + book3.price);
    }
}

/////////////////

/*
 * 2. Parameterized Constructor:
 * Write a Java program to create a class called Dog with instance variables
 * name and color. Implement a parameterized constructor that takes name and
 * color as parameters and initializes the instance variables. Print the values
 * of the variables.
 */

// class Dog {
// private String name;
// private String color;

// Dog(String name, String color) {
// this.name = name;
// this.color = color;
// }

// String getName() {
// return name;
// }

// String getColor() {
// return color;
// }
// }

// public class p1 {
// public static void main(String[] args) {
// Dog d = new Dog("DOG", "Black");
// System.out.println(d.getColor());
// System.out.println(d.getName());
// }
// }

////////////

/*
 * 1. Default Constructor:
 * Write a Java program to create a class called "Cat" with instance variables
 * name and age. Implement a default constructor that initializes the name to
 * "Unknown" and the age to 0. Print the values of the variables.
 */

// class Cat {
// String name;
// int age;

// Cat() {
// this.name = "Unknown";
// this.age = 0;
// }
// }

// public class p1 {
// public static void main(String[] args) {
// Cat c = new Cat();
// System.out.println(c.name + " - " + c.age);
// }
// }
