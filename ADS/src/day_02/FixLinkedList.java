package day_02;

class node {

    int data;
    node next;

}

public class FixLinkedList {

    node head, middle, last;

    void createList() {
        head = new node();
        middle = new node();
        last = new node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.next = middle;
        middle.next = last;
        last.next = null;
    }

    void showList() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        FixLinkedList obj = new FixLinkedList();
        obj.createList();
        obj.showList();

    }

}
