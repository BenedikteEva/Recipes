
package DatasourceSmallSteps;


import Business.Steps;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benedikte
 * this implements DataAccessObject. the class gets a connection to a mysql 
 * database and from a specified query gets a resusltset from the daabase 
 * there are two methods but only one of them is used 
 */
public class DataAccessObjectImpl implements DataAccessObject {

    private final Connector conn;

    public DataAccessObjectImpl() throws Exception {
        this.conn = new Connector();
    }

    /**This method gets a step from the mysql databse from its id
     * @param id    
     * @return  */    
    @Override
    public Steps getStep(int id) {
        Steps step = null;
        try {
            Statement stmt = Connector.getConnection().createStatement();
            String sql1 = "SELECT * from steps where step_id = " + id;
            ResultSet rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                int step_id = rs.getInt("step_id");
                String stepname = rs.getString("stepname");
            
                step = new Steps(step_id, stepname);

            }
        } catch (SQLException ex1) {
            Logger.getLogger(DataAccessObject.class
                    .getName()).log(Level.SEVERE, null, ex1);
        }
        return step;
    }
  /**This method gets all productss from the mysql databse it is not used
     * @return  */    
    @Override
      public ArrayList<Steps> getSteps() {
        Statement stmt;
        String sql = "SELECT * from steps";
        ArrayList<Steps> steps = new ArrayList<>();
        Steps step = null;
        try {
            stmt = conn.getConnection().createStatement();
            ResultSet rs2 = stmt.executeQuery(sql);
            while (rs2.next()) {
                int step_id = rs2.getInt("step_id");
                String stepname = rs2.getString("stepname");
                step = new Steps(step_id, stepname);
                steps.add(step);

            }
        } catch (SQLException ex3) {
            Logger.getLogger(DataAccessObjectImpl.class.getName()).log(Level.SEVERE, null, ex3);
        } 
        return steps;

    }

   

    public Connector getConn() {
        return conn;
    }


}
