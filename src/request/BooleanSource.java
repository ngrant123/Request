
package request;

/**
 *The code uses the BoolranSource class to check the probability that the
 *user request will arrived 
 *
 *the double probability is available
 *
 *@author Nathan Grant
 *
 *email: nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 */

public class BooleanSource{
    
    public double probability;
    
    
    /**
     *Default constructor for BooleanSource
     */
    public BooleanSource(){
        
        
    }
    /**
     *Initializes the new object and sets the probability to the 
     *one that is user specified
     *
     *@param prob
     */
    
   
    public BooleanSource(double prob){
        this.probability=prob;
        
    }
    
    /**
     *
     *Sets the probabilty to the user specified one 
     *
     *@param prob
     *The probability that the user specifies
     */
    
    public void setProb(double prob){
        this.probability=prob;
    }
    
    /**
     *Returns true or false depending on whether the random number
     *that is generated if between the probabilty and zero
     */
    
    public boolean requestArrived(){
        
        double num1= Math.random()*1;
        
        if(num1<=probability && num1>=0){
            return true;
        }
        else
            return false;
    } 
}