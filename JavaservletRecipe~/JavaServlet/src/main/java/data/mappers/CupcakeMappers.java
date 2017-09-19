package data.mappers;

import db.DB;
import domain.Recipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bo Henriksen
 */
public class CupcakeMappers {
    
    //prepare statement
    
    public Recipe getrecipe(int id) {
        Recipe recipe = null;
        try {

            Connection conn = new DB().getConnection();
            String sql = "SELECT * FROM recipe where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {

                id = rs.getInt("id");
                String navn = rs.getString("navn");
                String ingredienseAndAmount = rs.getString("ingredienseAndAmount");
                String instruktioner = rs.getString("instruktioner");
                

                recipe = new Recipe(id,navn,ingredienseAndAmount,instruktioner);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return recipe;
    }
    
    public int addRecipe(Recipe r) throws Exception {
        Connection conn = new DB().getConnection();
        String insertPerson = "INSERT INTO recipe (id, name, ingredienseAndAmount, instruktioner) VALUES (?, ?, ?, ?)";
        PreparedStatement personPstmt = conn.prepareStatement(insertPerson, Statement.RETURN_GENERATED_KEYS);
         
        personPstmt.setString(1, r.getNavn());
        personPstmt.setString(2, r.getIngredienseAndAmount());
        personPstmt.setString(3, r.getInstruktioner());
        int result = personPstmt.executeUpdate();
        ResultSet rs = personPstmt.getGeneratedKeys();
        rs.next();
        int personId = rs.getInt(1);
        return personId;
    } 
    
}
