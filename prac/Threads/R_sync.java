// Multithreading Problem

package Threads;

class Bus implements Runnable {
    int available = 1, passenger;

    Bus(int passenger) {
        this.passenger = passenger;
    }

    public synchronized void run() { // add synchronized here to give the seat to only one passenger instead of giving it to all the three passengers.
        String name = Thread.currentThread().getName();
        if (available >= passenger) {
            System.out.println(name + " reversed Seat..!");
            available -= passenger;
        } else {
            System.out.println("Sorry seat not available..!");
        }
    }
}

public class R_sync {
    public static void main(String[] args) {
        Bus r = new Bus(1);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Raju");

        t1.start();
        t2.start();
        t3.start();

    }
}
