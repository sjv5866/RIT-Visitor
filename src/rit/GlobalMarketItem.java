package rit;

/**
 * Visitable interface
 * In this instance, this will represent items in the global village market
 */
public interface GlobalMarketItem {
    /**
     * accept function for item to accept visitor
     * @param visitor visiting class to temporarily access item
     */
    public void accept(RITVisitor visitor);
}
