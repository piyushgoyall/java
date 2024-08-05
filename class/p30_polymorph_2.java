class abc {
    void print() {
        System.out.println("printing");
    }

    void print(float a) {
        System.out.println("printing float");
    }

    void print(int a) {
        System.out.println("displaying");
    }
}

class neww {

}

public class p30_polymorph_2 {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.print();
        obj.print(5);
        obj.print((float) 4.4);

        // neww o = new neww();
        // System.out.println(o); // this is basically o.toString() but toString() is
        // hidden

        neww o = new neww();
        neww o2 = new neww();
        System.out.println(o.equals(o2));

    }
}
