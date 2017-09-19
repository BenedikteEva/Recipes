/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import RecipesModel.Recipe;
import java.util.ArrayList;

/**
 *
 * @author Ejer
 */
public interface DataAccessObject {
    
    public ArrayList <Recipe> getRecipes ();
    public Recipe getRecipe();
    
    
    
}
