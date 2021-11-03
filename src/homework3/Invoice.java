package homework3;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    } 

    // getter 
    public int id() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }

    public int getCustomerID() {
        return customer.getID();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount() / 100;
    }
    
    // setter
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Invoice[id = " + id + 
        ", customer = " + customer.toString() + 
        ", amount = " + amount + "]";
    }
}
