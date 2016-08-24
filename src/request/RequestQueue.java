
package request;

   /**
    * This code extends from the Node class and is used to add the requests onto
    * a Queue
    * 
    * @author nathangrant
    * 
    * email:nathan.grant@stonybrook.edu
    * Stony Brook ID:109816757
    */     
        
        
        
public class RequestQueue extends Node {
    
 
    public Node head;
    
   /**
    * Default constructor for the Request class
    */
    
    public RequestQueue(){
        
    }
    /**
     * Adds the current node that is in the parameters to Queue, which 
     * is implemented with a Linkedlist
     * 
     * postcondition:
     * node will be added onto the Queue in a Linkedlist format
     * 
     * @param node1 
     */
    
    public void enque(Request node1){
        Node new1= new Node(node1);
        
        Node cursor= head;
        
        if(head==null){
            head=new1;
        }
        else{
        while(cursor!=null){
            cursor=cursor.getNext();
        }
        
        cursor.setNext(new1);
        }
    }
    /**
     * This method deletes and returns the node that is removed from the Queue
     * Because it is a Queue, the first node that is in the Queue is the one
     * that is removed
     * 
     * Postcondition:
     * The element is remove and the Queue is then updated
     * @return 
     */
    public Node dequeue(){
        
        Node new1= new Node();
        if(head!=null && head.getNext()!=null){
           new1= head;
            head=head.getNext();
        }
        else if(head !=null && head.getNext()==null){
            new1=head;
            head=null;
        }
        
        
        return new1;
        
    }
    
    /**
     * This method returns the size of the Queue
     * @return 
     */
    public int size(){
        
        int sum=0;
        Node cursor=head;
        
        while(cursor!=null){
            cursor=cursor.getNext();
            sum++;
        }
        return sum;
        
    }
    /**
     * This method checks if the current Queue is empty and returns true if it is 
     * @return 
     */
    public boolean isEmpty(){
      
        if(head==null)
            return true;
        
        return false;
        
    }
   
    
    
}
