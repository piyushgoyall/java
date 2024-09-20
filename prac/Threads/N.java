// Interrupt() in Threads

package Threads;

class M extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }
}

public class N {
    public static void main(String[] args) {
        M t = new M();
        t.start();
        t.interrupt(); // This is of no use if InterruptedException is not thrown. So to use Interrupt
                       // method we need to take the program to waiting state.

    }
}
