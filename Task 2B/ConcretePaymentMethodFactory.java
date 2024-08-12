public class ConcretePaymentMethodFactory extends PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod(String methodType) {
        switch (methodType) {
            case "CreditCard":
                return new CreditCard();
            case "PayPal":
                return new PayPal();
            case "Wallet":
                return new Wallet();
            default:
                throw new IllegalArgumentException("Unknown payment method: " + methodType);
        }
    }
}
