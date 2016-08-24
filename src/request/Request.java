
package request;

/**
 *The code creates a Request class that initializes the object
 *
 *The int sourceFloor, int destinationFloor, and int timeEntered are available
 *
 *@author Nathan Grant
 *
 *email: nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 */

public class Request{
    
    public int sourceFloor;
    public int destinationFloor;
    public int timeEntered;//time entered that the user specifies
    
    /**
     *Default constructor for Request
     */
   public Request(){
       
   }
   /**
    *Constructor that gets the number of floors from the user and 
    *and gets a random sourceFloor and destinationFloor to random
    *
    *Precondition:
    *Sets the number of Floors
    *
    *@param: none 
    */
   
   public Request(int numberofF){
       
       this.sourceFloor=(int)Math.random()*numberofF+1;
       this.destinationFloor=(int)Math.random()*numberofF+1;
       
   }
   /**
    *Method that returns the sourceFloor
    */
   
   public int getS(){
       return this.sourceFloor;
   }
    
   /**
    *Method that returns the destinationFloor
    */
  
   public int getDestination(){
       return this.destinationFloor;
   }
   
   /**
    *Method that returns the timeEntered
    */
   
   public int getTimeE(){
       return this.timeEntered;
   }
   
   /**
    *Sets the sourceFloor for the program
    *
    *@param:
    *The sourceFloor that user wants to set it to
    */
   
   public void setS(int source){
       this.sourceFloor=source;
   }
   
   /**
    *Sets the destinationFloor for the program
    *
    *@param:
    *The destinationFloor that user wants to set it to
    */
   
   public void setDes(int destination){
       this.destinationFloor=destination;
   }
    
   /**
    *Sets the time entered for the program
    *
    *@param:
    *The time that user wants to set it to
    */
   
   
   public void setTimeE(int timeE){
       this.timeEntered=timeE;
   }
   
   /**
    *Returns the string that contains the sourceFloor, destinationFloor, and 
    *the time entered
    *
    *@param:none
    */
   public String toString2(){
       return "("+getS()+ ","+getDestination()+","+getTimeE();
   }
}