package day_03;

class Node {

    int data;
    Node next;

}

public class CircularLinkedList {

    Node head = null;
    // Node head;  by default null

    void addFirst(int val) {
        Node newnode = new Node();
        newnode.data = val;
        if (head == null) {
            newnode.next = newnode;
            head = newnode;
        } else {
            Node lastnode = head;
            while (lastnode.next != head) {

                lastnode = lastnode.next;

            }
            lastnode.next = newnode;
            newnode.next = head;
            head = newnode;// shifting of head

        }
    }

    void addLast(int val) {
        Node newnode = new Node();
        newnode.data = val;
        if (head == null) {
            newnode.next = newnode;
            head = newnode;
        } else {
            Node lastnode = head;
            while (lastnode.next != head) {

                lastnode = lastnode.next;

            }
            lastnode.next = newnode;
            newnode.next = head;
            // head = newnode;// shifting of head  add first sathi

        }

    }

    void delete(int val) {
        if (head == null) {
            return;
        }

        if (head.data == val && head.next == head) {
            head = null;
        } //else if(head.data==val &&  && head.next!=head)
        else if (head.data == val) {
            Node temp = head;
            while (temp.next != head)// for circular only
            {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;

        } else {
            Node temp = head;
            while (temp.next != head) {
                if (temp.next.data == val) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
            head = head.next;

        }
    }

    boolean search(int val) {
        if (head == null) {
            return false;
        }

        Node temp = head;
        do {

            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    void print() {
        if (head == null) {
            return;
        }

        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);

    }

    public static void main(String[] args) {
        CircularLinkedList c1 = new CircularLinkedList();
        c1.addFirst(100);
        c1.addFirst(200);
        c1.addFirst(300);
        c1.addFirst(400);
        System.out.println("********************************************");

        // c1.print();
        System.out.println("********************************************");
        c1.addLast(10);
        c1.addLast(20);
        c1.addLast(30);
        c1.addLast(40);

        c1.delete(10);
        System.out.println(c1.search(4080));
        c1.print();

    }

}
