
package request;
import java.util.Scanner;

public class Analyzer{
    
    
    
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Welcome to the Elevator simulator!");
        
        System.out.println("Please enter the probability of the arrival for Requests: ");
        double num1= input.nextDouble();
        
        System.out.println("Please enter the number of floors");
         int num4= input.nextInt();
         
        System.out.println("Please enter the number of elevators: ");
        int num2= input.nextInt();
        
        System.out.println("Please enter the length of the simulation (int time units)");
        int num3=input.nextByte();
        
        Simulator sim1= new Simulator( num1,num4, num2,num3);
        
        sim1.simulate();
        
        
    }
}