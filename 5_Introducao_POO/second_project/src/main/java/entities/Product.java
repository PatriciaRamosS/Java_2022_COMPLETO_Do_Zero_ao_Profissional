
package entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock() {
        return price * quantity;
    }
    
    public void addProducts( int quantity ) {
        // O this está acessando o quantity da classe Produto e somando com o quantity da função addProducts
        this.quantity += quantity;
    }
    
    public void removeProducts( int quantity ) {
        this.quantity -= quantity;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f",totalValueInStock());   
    }
}
