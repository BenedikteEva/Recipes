
package DatasourceSmallSteps;
import Business.Steps;
import java.util.ArrayList;

/**
 *
 * @author Benedikte
 * sets to methods to be implemented in this case in a class named DataAccessObjectImpl 
 * we could have made a simple class instead since there is only one entity class in 
 * this program. 
 */
public interface DataAccessObject {

 
  
    	
	public ArrayList<Steps> getSteps();
	public Steps getStep(int id); 
	
        
}

