// class Toy {
//     class PlayStation {
//         int price = 1000;
//     }
// }

class Toy {
    static class PlayStation {
        int price = 1000;
    }
}

public class p36_InnerClass {
    public static void main(String[] args) {

        // for non static class

        // Toy t1 = new Toy();
        // Toy.PlayStation obj = t1.new PlayStation();

        // Toy.PlayStation obj1 = new Toy().new PlayStation();

        // for static class

        Toy.PlayStation obj = new Toy.PlayStation();
        System.out.println("Price of PlayStation: " + obj.price);
    }
}
