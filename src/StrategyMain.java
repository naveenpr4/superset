interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    
    public CreditCardStrategy(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }
    
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card (" + cardNumber + ")");
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String email;
    
    public PayPalStrategy(String email) {
        this.email = email;
    }
    
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal (" + email + ")");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234-5678-9012-3456"));
        cart.checkout(100);
        
        cart.setPaymentStrategy(new PayPalStrategy("john@example.com"));
        cart.checkout(50);
    }
}