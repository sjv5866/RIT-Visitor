package rit;

/**
 * Main visitor interface
 * This will represent the item pool for a register in the global village market
 */
public interface RITVisitor {
    /**
     * Access meat item in store
     * @param gmi meat global market item
     */
    public void visit(MeatGMI gmi);

    /**
     * Access standard item in store
     * @param gmi standard global market item
     */
    public void visit(ItemGMI gmi);

    /**
     * Access alcohol item in store
     * @param gmi alcohol global market item
     */
    public void visit(AlcoholGMI gmi);

    /**
     * Access subscription-based item in store
     * @param gmi subscription-based global market item
     */
    public void visit(SubscriptionGMI gmi);
}
