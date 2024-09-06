package p56_generics;

public class p2_MyGenericClass<E> {
    E x;

    p2_MyGenericClass(E x) {
        this.x = x;
    }

    public E getElem() {
        return x;
    }
}
