package rit;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<GlobalMarketItem> cart = new ArrayList<>();
        cart.add(new MeatGMI(6.24));
        cart.add(new ItemGMI(23.99));
        cart.add(new AlcoholGMI(14.00));
        cart.add(new SubscriptionGMI(78.50));

        RegisterVisitor register = new RegisterVisitor();
        for (GlobalMarketItem gmi : cart) {
            gmi.accept(register);
            System.out.println("Subtotal: $" + register.getTotal());
        }

        System.out.println("\nTotal Price: $" + register.getTotal());
    }
}
