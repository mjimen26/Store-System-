package storesystem;

/**
 * Zack added that
 * A line item in an invoice
 */
public interface LineItem {
    
    /**
     * Gets the price of this line item.
     * @return the price.
     */
    double getSellPrice();
    
    /**
     * Gets the description of this line item.
     * @return the description
     */
    String toString();
    
}
