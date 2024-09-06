package p56_generics;

public class p2_Main {
    public static void main(String[] args) {
        p2_MyGenericClass<Integer> a = new p2_MyGenericClass<>(1);
        p2_MyGenericClass<Double> b = new p2_MyGenericClass<>(1.1);
        p2_MyGenericClass<Character> c = new p2_MyGenericClass<>('a');
        p2_MyGenericClass<String> d = new p2_MyGenericClass<>("A");

        System.out.println(a.getElem());
        System.out.println(b.getElem());
        System.out.println(c.getElem());
        System.out.println(d.getElem());
    }
}
