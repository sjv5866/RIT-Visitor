package rit;
import java.util.Scanner;

/**
 * Concrete RIT Visitor class that serves as a mock-register in a campus store
 */
public class RegisterVisitor implements RITVisitor{
    private Scanner myScan = new Scanner(System.in);
    private double total; // total price of shopping cart

    /**
     * handle the scanning of meat in the market
     * @param gmi meat global market item
     */
    @Override
    public void visit(MeatGMI gmi) {
        System.out.print("How much meat do you want to purchase (in pounds)? ");
        String ans = myScan.nextLine();
        double weight = Double.parseDouble(ans);
        double subtotal = gmi.getPrice(weight);
        System.out.println("Meat price: $" + gmi.getPrice(weight));
        total += subtotal;
    }

    /**
     * handle the scanning of standard items in the market
     * @param gmi standard global market item
     */
    @Override
    public void visit(ItemGMI gmi) {
        System.out.print("How many of that item do you want to purchase (quantity)? ");
        int quant = myScan.nextInt();
        double subtotal = gmi.getPrice(quant);
        System.out.println("Item price: $" + subtotal);
        total += subtotal;
    }

    /**
     * handle the scanning of alcohol in the market
     * @param gmi alcohol global market item
     */
    @Override
    public void visit(AlcoholGMI gmi) {
        System.out.print("Are you over 18 (y/n)?");
        String ans = myScan.nextLine();
        double subtotal = 0;
        if (ans.toUpperCase().equals("Y")) {
            System.out.print("How much alcohol do you want to purchase (per litre)?");
            ans = myScan.nextLine();
            double litres = Double.parseDouble(ans);
            subtotal = gmi.getPrice(litres);
            System.out.println("Alc price: $" + subtotal);
        } else {
            System.out.println("Cannot make a purchase: buyer too young. Authorities will have to be called :^).");
        }
        total += subtotal;
    }

    /**
     * handle the scanning of subscription-based items in the market (no student discounts allowed :[)
     * @param gmi subscription-based global market item
     */
    @Override
    public void visit(SubscriptionGMI gmi) {
        System.out.print("How many months are you planning on sticking with this subscription? ");
        int months = myScan.nextInt();
        double subtotal = gmi.getPrice(months);
        System.out.println("Subscription price: $" + subtotal);
        total += subtotal;
    }

    /**
     * Grab the total price of all items
     * @return total price of all items
     */
    public double getTotal() {
        return total;
    }
}
