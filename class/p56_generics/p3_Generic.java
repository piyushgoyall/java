package p56_generics;

public class p3_Generic<E1, E2> {
    E1 a;
    E2 b;

    p3_Generic(E1 a, E2 b) {
        this.a = a;
        this.b = b;
    }

    public E1 getElem1() {
        return a;
    }

    public E2 getElem2() {
        return b;
    }

    @Override
    public String toString() {
        return (a + " " + b);
    }
}
