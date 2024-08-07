// Abstract method can only be made in abstract class

abstract class ChefRules {
    abstract void cook();

    abstract void bake();

    abstract void dress();

    void eats() {
        System.out.println("Chef is Eating");
    }
}

class TajChef extends ChefRules {

    @Override
    void cook() {
        System.out.println("Chef of Lalit is Cooking");
    }

    @Override
    void bake() {
        System.out.println("Chef of Taj is baking");
    }

    @Override
    void dress() {
        System.out.println("Chef of Taj should wear white dress");
    }

}

public class p33_abstract {
    public static void main(String[] args) {
        TajChef tc = new TajChef();
        tc.bake();
        tc.cook();
        tc.dress();
        tc.eats();
    }
}
