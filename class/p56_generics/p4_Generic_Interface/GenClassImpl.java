package p56_generics.p4_Generic_Interface;

public class GenClassImpl<E> implements Interface<E>  {
    private E e;

    @Override
    public void setVal(E e) {
        this.e = e;
    }

    @Override
    public E getValue()
    {
        return e; 
    }
}
