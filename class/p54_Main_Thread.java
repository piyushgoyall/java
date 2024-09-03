public class p54_Main_Thread {
    public static void main(String[] args) {
        System.out.println("Entering main thread");

        p55_Thread_1 t1 = new p55_Thread_1();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }

        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println("Exiting main thread");
    }
}