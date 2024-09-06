package p56_generics;

public class p3_Main {
    public static void main(String[] args) {
        p3_Generic<Integer, Integer> a = new p3_Generic<>(1, 2);
        p3_Generic<Double, Double> b = new p3_Generic<>(1.1, 2.2);
        p3_Generic<Character, Character> c = new p3_Generic<>('a', 'b');
        p3_Generic<String, String> d = new p3_Generic<>("A", "B");

        System.out.println(a);
        System.out.println(b.getElem1()+ " " + b.getElem2());
        System.out.println(c.getElem1()+ " " + c.getElem2());
        System.out.println(d.getElem1()+ " " + d.getElem2());
    }
}
