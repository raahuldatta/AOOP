import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAuthentication auth = UserAuthentication.getInstance();
        
        System.out.print("Enter your username to login: ");
        String userName = scanner.nextLine();
        auth.login(userName);

        if (auth.isAuthenticated()) {
            VehicleFactory vehicleFactory = new ConcreteVehicleFactory();
            PaymentMethodFactory paymentFactory = new ConcretePaymentMethodFactory();
            
            System.out.print("Choose a vehicle (Car/Bike/Scooter): ");
            String vehicleType = scanner.nextLine();
            Vehicle vehicle = vehicleFactory.createVehicle(vehicleType);
            vehicle.ride();

            System.out.print("Choose a payment method (CreditCard/PayPal/Wallet): ");
            String paymentType = scanner.nextLine();
            PaymentMethod paymentMethod = paymentFactory.createPaymentMethod(paymentType);
            paymentMethod.pay(20.00);  // Example amount for the ride

            auth.logout();
        }
        scanner.close();
    }
}