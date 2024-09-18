// Inheritance-II customer and Bank account

class Customer {
    private int ID;
    private String name;
    private char gender;

    Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    int getID() {
        return ID;
    }

    String getName() {
        return name;
    }

    char getGender() {
        return gender;
    }

    public String toString() {
        return (name + "(" + ID + ")");
    }
}

class BankAccount {
    private int ID;
    private Customer customer;
    private double balance;

    BankAccount(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    int getID() {
        return ID;
    }

    Customer getCustomer() {
        return customer;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance += balance;
    }

    public String toString() {
        return (customer.toString() + "balance=INR" + String.format("%.2f", balance));
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdrawl(double amt) {
        if (balance < amt) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amt;
        }
    }

}

public class p4_Inherit {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(1, "Piyush", 'M');

        // Create a BankAccount object for the customer with an initial balance
        BankAccount account = new BankAccount(101, customer, 5000.00);

        // Display initial details of the account
        System.out.println(account);

        // Perform a deposit
        account.deposit(2000.00);
        System.out.println("After deposit: " + account);

        // Perform a withdrawal
        account.withdrawl(1500.00);
        System.out.println("After withdrawal: " + account);

        // Try to withdraw more than the balance
        account.withdrawl(10000.00);
    }
}
