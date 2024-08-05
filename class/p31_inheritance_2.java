class Bike {
    void sound() {
        System.out.println("Every bike has its own sound");
    }
}

class Enfield extends Bike {
    void sound() {
        System.out.println("Dug dug");
        super.sound();
    }
}

class Hunter extends Enfield {
    void sound() {
        System.out.println("vroom vroom");
        super.sound(); // when hunter is called first vroom is printed then it's parent i.e. Enfield's sound() is called
    }
}

public class p31_inheritance_2 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.sound();

        System.out.println("\n");

        Enfield e1 = new Enfield();
        e1.sound();

        System.out.println("\n");

        // UPCASTING
        Bike b2 = new Enfield();
        b2.sound();

        System.out.println("\n");

        Hunter h1 = new Hunter();
        h1.sound();
    }
}