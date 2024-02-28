package rit;

/**
 * Shop item that represents subscription-based item purchased by the month
 */
public class SubscriptionGMI implements GlobalMarketItem{
    private double pricePerMonth; //price for item per month
    public SubscriptionGMI(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }
    @Override
    public void accept(RITVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * Calculate price of subscription item based on numbers of months
     * @param months numbers of months in subscription
     * @return price of subscription item with months factored in
     */
    public double getPrice(int months) {
        return pricePerMonth * months;
    }
}
