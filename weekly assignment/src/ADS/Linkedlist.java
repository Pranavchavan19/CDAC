
package ADS;

class node
{
  int data;
  node next;
}
public class Linkedlist {
    node head,middle,last;
    void print()
    {
        head=new node();
        middle=new node();
        last=new node();
       
        
        head.data=10;
        middle.data=20;
        last.data=30;
        
        head.next=middle;
        middle.next=last;
        last.next=null;
    
    }
    void show()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    
    }
    public static void main(String[] args) {
        Linkedlist g=new Linkedlist();
        g.print();
        g.show();
    }
    
}
