// Suspend() and resume() in Threads

package Threads;

class E extends Thread {
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}

public class F {
    public static void main(String[] args) {
        E t1 = new E();
        E t2 = new E();
        E t3 = new E();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        // t2.suspend(); // Suspend t2

        t3.start();

        // t2.resume(); // Resume t2
    }
}
