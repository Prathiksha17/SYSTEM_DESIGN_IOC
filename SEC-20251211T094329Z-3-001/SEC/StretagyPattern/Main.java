// What is it?
// Strategy pattern lets you change the behavior of an object at runtime. 
// Think of it as having different strategies to solve the same problem.

class Main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrateggy(new CreditCardPayment("23875yt234875") );
        cart.checkout(500);

        cart.setPaymentStrateggy(new DebitCard("213432324"));
        cart.checkout(600);

        cart.setPaymentStrateggy(new UPI("itsmesohit@ybl"));
        cart.checkout(4523);
        cart.setPaymentStrateggy(new CashPayment());
        cart.checkout(2355);
    }
}