interface Employee {
    default void breath() {
        System.out.println("Employee Breathing");
    }
}

interface Trainer {
    default void breath() {
        System.out.println("Trainer Breathing");
    }
}

class Hello implements Employee,Trainer{

   public void breath()
   {
       Employee.super.breath();
   }
    
}

public class p35_mulitple_inheri {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1.breath();
    }
}
