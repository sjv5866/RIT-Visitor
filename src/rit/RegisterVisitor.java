package rit;
import java.util.Scanner;

/**
 * Concrete RIT Visitor class that serves as a mock-register in a campus store
 */
public class RegisterVisitor implements RITVisitor{
    private double total; // total price of item

    /**
     * handle the scanning of meat in the market
     * @param gmi meat global market item
     */
    @Override
    public void visit(MeatGMI gmi) {

    }

    /**
     * handle the scanning of standard items in the market
     * @param gmi standard global market item
     */
    @Override
    public void visit(ItemGMI gmi) {

    }

    /**
     * handle the scanning of alcohol in the market
     * @param gmi alcohol global market item
     */
    @Override
    public void visit(AlcoholGMI gmi) {

    }

    /**
     * handle the scanning of subscription-based items in the market (no student discouts allowed :[)
     * @param gmi subscription-based global market item
     */
    @Override
    public void visit(SubscriptionGMI gmi) {

    }

    /**
     * Grab the total price of all items
     * @return total price of all items
     */
    public double getTotal() {
        return total;
    }
}
