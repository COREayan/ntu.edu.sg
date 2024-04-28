package two.four;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

     public int getID() {
        return this.id;
     }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return this.customer.getID();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return (this.amount * (100 - this.customer.getDiscount()))/100;
    }

    public String toString() {
        return "Invoice[id="+this.id+",customer="+customer+",amount="+this.amount+"]";
    }
}
