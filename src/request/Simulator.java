
package request;

/**
 *The code uses the previous classes to create the simulation of the elevators
 *acting
 * 
 *the double probabilty,int numberofF, int elevatorS, and the lengthS are 
 *available
 *
 *@author Nathan Grant
 * 
 *email: nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 */

public class Simulator{
    
    public double probability;
    public int numberofF;
    public int elevators;
    public int lengthofS;//duration of the program
    
    /**
     *Constructor that initializes the probabilty, the numberofF, the
     *elevatorS and the lenght of the simulation
     */
    public Simulator(double prob, int number, int elevator,int length){
        
        this.probability=prob;
        this.numberofF=number;
        this.elevators=elevator;
        this.lengthofS=length;
    }
    /**
     *Simulation of the elevator program
     *Creates a number of elevators that either goes down or up depending 
     *on where the sourceFloor or destinationFloor is located
     *
     *Simulation ends when the lengthofS is over
     *@param: none
     */
    public void simulate(){
        
        int sum=0;
        int floor=1;
        int j=0;
        int Wtime=0;
        boolean turn=false;
        int numofR=0;
       // Request new1= new Request(numberofF);
      // Elevator new2= new Elevator();
       
        Elevator new3 []= new Elevator[elevators];
        
         for(j=0;j<elevators;j++){
           Elevator new2= new Elevator();   
              
              
              new2.setcF(floor);
              new2.setElevatorS("IDLE");
              new2.setObj(null);
              
              new3[j]=new2;
          
          }
         
         while(sum<=lengthofS){
             BooleanSource new5=new BooleanSource();
             new5.setProb(probability);
             
            if(new5.requestArrived()==true){
                numofR++;
                Request new1= new Request();
                new1.setTimeE(sum);
                RequestQueue hold= new RequestQueue();
                hold.enque(new1);
               
            for(int k=0;k<elevators;k++){
                
              if(new3[k].getElevatorS().compareTo("TO_DESTINATION")==0){
                  
                  if(new3[k].getcF()<new3[k].object.getDestination()){
                      
                     int Cfloor= new3[k].getcF();
                        Cfloor++;
                        new3[k].setcF(Cfloor);
                      
                  }
                  else if(new3[k].getcF()>new3[k].object.getDestination()){
                      
                     int Cfloor= new3[k].getcF();
                        Cfloor--;
                        new3[k].setcF(Cfloor);
                      
                  }
                  else if(new3[k].getcF()==new3[k].object.getDestination()){
                      new3[k].setElevatorS("IDLE");
                  }
                  
                  
              }
             
              else if(new3[k].getElevatorS().compareTo("IDLE")==0){
                    Request new6=hold.dequeue();
                    
                    if(new3[k].getcF()<new6.sourceFloor  ){
                        
                        new3[k].setElevatorS("TO_SOURCE");
                        int Cfloor= new3[k].getcF();
                        Cfloor++;
                        new3[k].setcF(Cfloor);
                        Wtime++;
                    }
                    
                    else if(new3[k].getcF()>new6.sourceFloor  ){
                        
                        new3[k].setElevatorS("TO_SOURCE");
                        int Cfloor= new3[k].getcF();
                        Cfloor--;
                        
                        new3[k].setcF(Cfloor);
                        Wtime++;
                    }
                    
                    else if(new3[k].getcF()==new6.sourceFloor){
                        new3[k].setElevatorS("TO_DESTINATION");
                        break;
                        
                    }
            }
       
                }
            }
                sum++;
        }
         
        System.out.println("Total wait time:"+ Wtime );
        System.out.println("Total RequestL: "+numofR);
        double waitT= Wtime/numofR;
        System.out.println("The average wait time is:"+waitT);
        
        
    }
}