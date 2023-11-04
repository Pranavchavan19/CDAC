package day_02;
// head node cha pude node add karachi ani nantar nantar la front ananyche

class node {
    
    int data;
    node next;
}

public class Singly_Linked_list {

    node head = null;
    // node head;  

    void addFirst(int val) {
        node newnode = new node();
        newnode.data = val;
        newnode.next = head;

        head = newnode;//shifting of head to new node

    }

    void addLast(int val) {
        node newnode = new node();
        newnode.data = val;

        if (head == null) {
            head = newnode;
        } 
        else {
            node lastnode = head;
            while (lastnode.next != null) {
                lastnode = lastnode.next;
            }
            lastnode.next = newnode;
        }

    }
    void deleteNode(int val) {
        if (head.data == val) {
            head = head.next;
        } else {
            node temp = head;
            while (temp.next != null) {
                if (temp.next.data == val) {

                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }

        }
    }
    boolean searchNode(int val) {
        node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }

            temp = temp.next;

        }
        return false;

    }

    void printList() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        Singly_Linked_list s = new Singly_Linked_list();
       
        s.addFirst(10);
//        s.addFirst(20);
//        s.addFirst(30);
//        s.addFirst(40);
//        s.addFirst(50);
        System.out.println("*********************************************************************");

//        s.addLast(100);
//        s.addLast(200);
//                
//
//        s.addLast(300);
//        s.addLast(400);

        s.printList();
        System.out.println(s.searchNode(130));
//        s.deleteNode(300);
//        s.printList();
    }

}
