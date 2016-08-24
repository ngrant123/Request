
package request;


/**
 *The code uses Node class to stores the object into
 *an ItemInfoNode object
 *the object Request, and Node next are contained
 *
 *@author Nathan Grant
 *
 *email: nathan.grant@stonybrook.edu
 *Stony Brook Id:109816757
 */

public class Node extends Request{
    
    public Request object;
    public Node next;
    
    /**
     *Default constructor for Node
     */
    
    public Node(){
        
    }
    
    /**
     *Initializes the new object
     *
     *@param:none
     */
   
    
    
    public Node(Request new1){
        
        this.object=new1;
    }
    
    /**
     *Initializes the new object, and the Node next
     *
     *@param:none
     */
    
    public Node(Request object, Node next){
       
        this.object=object;
        this.next=next;
    
    }
    
    /**
     *Sets Request info to Request object
     *
     *@param:
     *The Request that the user wants to set that Request object to
     */
    public void setInfo(Request info){
        this.object=info;
    }
    
    /**
     *Sets Node node to Node next
     *
     *@param:
     *The Node that the user wants to set that Node next to
     */
    
    public void setNext(Node node){
        this.next=node;
    }
  
    /**
     *Method that allows the user to get the Node node from the 
     *program
     */
    public Node getNext(){
        return next;
    }
}
    