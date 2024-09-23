package Threads;

class Bank extends Thread {
    static int bal = 5000;
    static int withdraw;

    Bank(int withdraw) {
        Bank.withdraw = withdraw;
    }

    public static synchronized void Withdraw() {
        String name = Thread.currentThread().getName();
        if (withdraw <= bal) {
            System.out.println(name + " withdrawn money");
            bal = bal - withdraw;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void run() {
        Withdraw();
    }
}

public class V_sync {
    public static void main(String[] args) {
        Bank obj = new Bank(5000);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("Harry");
        t2.setName("Jerry");

        Bank obj2 = new Bank(5000);

        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);

        t3.setName("Tom");
        t4.setName("Ron");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
