package rit;

/**
 * Shop item that represents meat purchased by the pound
 */
public class MeatGMI implements GlobalMarketItem {
    private double pricePerPound;
    public MeatGMI(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
    @Override
    public void accept(RITVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * Calculate price based on weight specified
     * @param weight the weight specified
     * @return total price of meat with weight factored in
     */
    public double getPrice(double weight) {
        return weight * pricePerPound;
    }
}
