// Join() in Threads

package Threads;

class C extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}

public class D {
    public static void main(String[] args) {
        C t1 = new C();
        C t2 = new C();
        C t3 = new C();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {

        }

        t1.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }

    }
}
