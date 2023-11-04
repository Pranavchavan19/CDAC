package day_04;

class Node {

    Node prev;
    int data;
    Node next;
}

public class DoublyLinkedListDemo {

    Node head = null;

    void addFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (head == null) {
            newNode.next = null;
            newNode.prev = null;
            head = newNode;

        } else {

            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (head == null) {
            newNode.next = null;
            newNode.prev = null;
            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
        }

    }
    
    void delete(int val) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != val) {
            temp = temp.next;
        }
        if (temp == null)// No node
        {
            System.out.println("Data Not found....");
        } else if (temp == head)//for heda
        {
            head = head.next;
            head.prev = null;
        } else if (temp.next == null)// for last node
        {
            temp.prev.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    void printD() {
        System.out.println("Forward movement-->");
        Node temp = head;
        Node last = null;//temp
        while (temp != null) {
            System.out.println(temp.data);

            if (temp.next == null) {
                last = temp;
            }
            temp = temp.next;
//            System.out.println(temp);
        }

        System.out.println("Backward movement -->");
        // temp=last;
//        System.out.println(last);
        while (last != null) {
            System.out.println(last.data);
            last = last.prev;
//            System.out.println(last);
        }
    }

    public static void main(String[] args) {
        DoublyLinkedListDemo dll = new DoublyLinkedListDemo();
        dll.addFirst(100);
        dll.addFirst(200);
        dll.addFirst(300);
        dll.addLast(400);
        dll.addLast(500);
        dll.addLast(600);
        dll.addLast(700);

        // dll.delete(5555);
//       dll.delete(300);
//       dll.delete(600);
//        System.out.println(dll.search(700));
        dll.printD();
        // dll.printDll();

    }

}
