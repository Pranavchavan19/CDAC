package ADS;

class node {

    node prev;
    int data;
    node next;

}

public class doubly_Linked_list {

    node head = null;

    public void addFirst(int val) {
        node newnode = new node();
        newnode.data = val;
        if (head == null) {
            newnode.next = null;
            newnode.prev = null;
            head = newnode;

        } else {
            newnode.prev = null;
            newnode.next = head;

            head.prev = newnode;
            head = newnode;

        }

    }
    

    public static void main(String[] args) {

    }

}
