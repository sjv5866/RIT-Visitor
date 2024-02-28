package rit;

/**
 * Shop item that represents an alcoholic item purchased by the litre
 */
public class AlcoholGMI implements GlobalMarketItem{
    private double pricePerLitre; //price for alcoholic item per litre
    public AlcoholGMI(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }
    @Override
    public void accept(RITVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * Calculate price of alcohol based on litres
     * @param litres the number of litres desired
     * @return total price of alcohol with litres factored in
     */
    public double getPrice(double litres) {
        return pricePerLitre * litres;
    }
}
