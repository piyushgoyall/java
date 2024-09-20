// isAlive() in Threads

package Threads;

class K extends Thread {
    public void run() {
        System.out.println("isAlive method program");

    }
}

public class L {
    public static void main(String[] args) {
        K t1 = new K();
        K t2 = new K();

        System.out.println(t1.isAlive());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
    }

}
