package p55_threads_2;

class PrintDemo {

    void printi() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Value of i: " + i);
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }
}

public class Thread1 extends Thread {
    PrintDemo pd;
    String x = new String();

    public Thread1(String thread1, PrintDemo pd) {
        super(thread1);
        this.pd = pd;
    }

    public void run() {
        synchronized (x) {
            pd.printi();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
