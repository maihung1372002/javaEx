package homework3;

public class Account {
    private String id;
    private String name;
    private int balance = 0;
 
    // contructor
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getter
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    // end getter

    public int credit(int amount) {
        return this.balance += amount;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int tranferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public String toString() {
        return "Account[id = " + id +
        ", name = " + name +
        ", balance = " + balance + "]";
    }
}

