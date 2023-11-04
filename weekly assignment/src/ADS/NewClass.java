package ADS;

class data {

    int size = 3;
    int top = -1;
    int a[] = new int[size];

    public boolean isEmpty() {
        if (top == 0) {

            return true;

        } else {
            return false;
        }

    }

    public boolean isFull() {
        if (top == a.length - 1) {

            return true;

        } else {
            return false;
        }

    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full....");
        } else {
            ++top;
            a[top] = value;

        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.....");
        } else {
            System.out.println(a[top] + "  element is poped...");
            top--;

        }

    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.....");

        } else {
            System.out.println(a[top] + " element is peek");

        }

    }
}

public class NewClass {

    public static void main(String[] args) {
        data n = new data();
        n.push(2);
        System.out.println("2 is pushed");
         n.push(22);
        System.out.println("22 is pushed");
      
         n.push(222);
           
        System.out.println("222 is pushed");
         n.push(2222);
          n.pop();
        
       // System.out.println("2222 is pushed");
        System.out.println(n.isEmpty());
         System.out.println(n.isFull());
           n.pop();
          n.pop();
        
    }

}
