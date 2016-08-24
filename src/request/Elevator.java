
package request;

/**
 *The code uses Elevator class to stores the Request object
 *
 *the int currentFloor, String elevatorState, String IDLE, String 
 *TO_DESTINATION, string TO_SOURCE, and the Request object are available 
 * 
 *@author Nathan Grant
 *
 *email: nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 *
 */



public class Elevator extends Request{
    
    public int currentFloor;
    public String elevatorState;
    public final String IDLE="IDLE";
    public final  String TO_DESTINATION="TO_DESTINATION";
    public final String TO_SOURCE="TO_SOURCE";
    public Request object;
    
    /**
     *Default constructor for Elevator that initializes object,
     *currentFloor, and elevatorState
     */
   public Elevator(){
       
       this.object=null;
       this.currentFloor=1;
       this.elevatorState=IDLE;
   }
   
   /**
    *Method that allows the user to get the currentfloor
    */
    
   public int getcF(){
       return this.currentFloor;
   }
   /**
    *Method that allows the user to get the elevatorState
    */
   public String getElevatorS(){
       return this.elevatorState;
   } 
    
   
   /**
    *Method that allows the user to get the object of the program
    */
   public Request getObject(){
       return this.object;
   }
   
   /**
    *Sets the currentF that the user wants specified to currentFloor
    *@param currentF
    *The currentF that the user wants specified
    */
   public void setcF(int currentF){
       this.currentFloor=currentF;
   }
    
   /**
    *Sets the elevatorS that the user wants specified to elevatorState
    *
    *@param:
    *The elevatorS that the user wants specified
    */
   public void setElevatorS(String elevatorS){
       this.elevatorState=elevatorS;
   }
   
   /**
    *Sets the obj that the user wants specified to Request obj
    *
    *@param obj
    *The object that the user wants specified
    */
   public void setObj(Request obj){
       this.object=obj;
   }
   
   /**
    *Returns the string that contains the currentFloor, elevatorState, and 
    *the details of the object
    */
   public String toString(){
       return "[+ "+getcF()+", "+getElevatorS()+", ("+object.toString2()+")";
   }
   
           
   
}