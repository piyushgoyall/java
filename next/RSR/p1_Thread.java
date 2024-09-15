package RSR;

public class p1_Thread {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Prateek");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }

    }
}

class A extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Khachi");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}