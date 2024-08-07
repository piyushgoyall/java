interface Employee {
    void id(); // this is by default abstract

    void name(); // this too

    default void lunch() {
        System.out.println("Employee is on a lunch break");
    }
}

class Trainer implements Employee {

    @Override
    public void id() {
        System.out.println("This is trainer's ID");
    }

    @Override
    public void name() {
        System.out.println("This is trainer's name");
    }

    @Override
    public void lunch()
    {
        System.out.println("Trainer is having tea");
    }

}

public class p34_interface {
    public static void main(String[] args) {
        Trainer t1 = new Trainer();
        t1.id();
        t1.lunch();
    }
}
