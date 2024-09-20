// Yield() in Threads
 
package Threads;

class Threads1 extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
            Thread.yield();
        }
    }
}

class Threads2 extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }
}

public class H {
    public static void main(String[] args) {
        Threads1 t1 = new Threads1();
        Threads2 t2 = new Threads2();

        t1.start();
        t2.start();
    }
}
