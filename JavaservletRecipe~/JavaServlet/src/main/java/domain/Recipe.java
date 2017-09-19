package domain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bo Henriksen
 */
public class Recipe {
    
    int id;
    String navn;
    String ingredienseAndAmount;
    String instruktioner;

    public Recipe(int id, String navn, String ingredienseAndAmount, String instruktioner) {
        this.id = id;
        this.navn = navn;
        this.ingredienseAndAmount = ingredienseAndAmount;
        this.instruktioner = instruktioner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getIngredienseAndAmount() {
        return ingredienseAndAmount;
    }

    public void setIngredienseAndAmount(String ingredienseAndAmount) {
        this.ingredienseAndAmount = ingredienseAndAmount;
    }

    public String getInstruktioner() {
        return instruktioner;
    }

    public void setInstruktioner(String instruktioner) {
        this.instruktioner = instruktioner;
    }

    @Override
    public String toString() {
        return "Recipe{" + "id=" + id + ", navn=" + navn + ", ingredienseAndAmount=" + ingredienseAndAmount + ", instruktioner=" + instruktioner + '}';
    }
    
    
    
    
    
}
