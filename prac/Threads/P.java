package Threads;

class O extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}

public class P {
    public static void main(String[] args) {
        O t1 = new O();
        O t2 = new O();
        O t3 = new O();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(2);
        t2.setPriority(10);
        t3.setPriority(6);

        t1.start();
        t2.start();
        t3.start();
    }
}
