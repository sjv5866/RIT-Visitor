package rit;

/**
 * Shop item that represents a standard item in the market
 */
public class ItemGMI implements GlobalMarketItem {
    private double price; //price for single item
    public ItemGMI(double pricePerPound) {
        this.price = pricePerPound;
    }

    @Override
    public void accept(RITVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * Calculate price of item based on quantity
     * @param quantity the quantity of item selected
     * @return total price of item with quantity factored in
     */
    public double getPrice(int quantity) {
        return price * quantity;
    }
}
