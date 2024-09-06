package p56_generics.p4_Generic_Interface;

public class Main {
    public static void main(String[] args) {
        GenClassImpl<Integer> a = new GenClassImpl<Integer>();
        a.setVal(1000);
        Integer val = a.getValue();
        System.out.println(val);
    }
}
