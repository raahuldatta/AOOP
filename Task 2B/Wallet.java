public class Wallet extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Wallet.");
    }
}
