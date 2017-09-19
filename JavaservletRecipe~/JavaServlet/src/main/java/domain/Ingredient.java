package domain;

/**
 *
 * @author Bo Henriksen
 */
public class Ingredient {
    
    int id_amount;
    int amount;

    public Ingredient(int id_amount, int amount) {
        this.amount = amount;
    }

    public int getId_amount() {
        return id_amount;
    }

    public void setId_amount(int id_amount) {
        this.id_amount = id_amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "id_amount=" + id_amount + ", amount=" + amount + '}';
    }

    
    
    
    
}
