public class Account {
    private double balance = 6000.00;
    public double getBalance(int accountId) {
        return balance;
    }    
public static void main(String[] args) {
    Account accnt = new Account();
    double value = accnt.getBalance(123456789);
    System.out.println("The balance is: " +value);
}
}