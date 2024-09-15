package RSR;

public class p2_Thread {
    public static void main(String[] args) {
        A r = new A();

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B");
        }
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A");
        }
    }
}
