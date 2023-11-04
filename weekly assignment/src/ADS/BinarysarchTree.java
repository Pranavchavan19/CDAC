
package ADS;

class node
{
    node left;
    int data;
    node right;

    public node( int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
   
}
public class BinarysarchTree {
    node  root;// null
    public node insertNode(node root , int val)
    {
        
        if(root ==null)
           return new node(val);
        
        
     return root;
    }
    public static void main(String[] args) {
        
    }
    
}
