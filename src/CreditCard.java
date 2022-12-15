public class CreditCard {
    // Instance variables:
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    // Constructor:
    CreditCard(String no, String nm, String bk, double bal, int lim) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }

    // Accessor methods:
    public String getNumber() { return number; }
    public String getName() { return name; }
    public String getBank() { return bank; }
    public double getBalance() { return balance; }
    public int getLimit() { return limit; }

    // Setters method
    public void setNumber(String no) {
        number = no;
    }
    public void setName(String nm) {
        name = nm;
    }
    public void setBank(String bk) {
        bank = bk;
    }
    public void setBalance(double bal) {
        balance = bal;
    }
    public void setLimit(int lim) {
        limit = lim;
    }

    // Action methods:
    // Make a charge
    public boolean chargeIt(double price) {
        if (price + balance > (double) limit)
            return false; // There is not enough money left to charge it
        balance += price;
        return true; // The charge goes through in this case
    }

    // Make a payment
    public void makePayment(double payment) {
        balance -= payment;
    }

    // Print a card's information
    public static void printCard(CreditCard c) {
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance()); // Implicit cast
        System.out.println("Limit = " + c.getLimit()); // Implicit cast
    }


}
