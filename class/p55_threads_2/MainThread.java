package p55_threads_2;

public class MainThread {
    public static void main(String[] args) {
        PrintDemo pd = new PrintDemo();
        System.out.println("Entering main thread");
        Thread1 t1 = new Thread1("t1", pd);
        Thread1 t2 = new Thread1("t2", pd);
        t1.start();
        t2.start();
        System.out.println("Exiting main thread");
    }
}
