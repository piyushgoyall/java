// Stop() in Threads

package Threads;

class I extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}

public class J {
    public static void main(String[] args) {
        I t1 = new I();
        I t2 = new I();
        I t3 = new I();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        // t2.stop();
    }
}
