package ads;

class Mystack {

    final int SIZE = 3;
    int arr[] = new int[SIZE];
    int top = -1;

    public boolean isEmpty() {

        if (top == 0) {//1
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull() {

        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }

    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            ++top;
            arr[top] = value;

        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty......");
        } else {
            System.out.println(arr[top] + "  is poped....");
            top--;

        }

    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty........");
            return;
        }
        System.out.println("peek element is " + arr[top]);
        return;

    }
}

public class ADS {

    public static void main(String[] args) {
        Mystack stack = new Mystack();
//        stack.push(10);
//        System.out.println("10 is pushed");
//        stack.pop();
//        stack.push(20);
//        System.out.println("20 is pushed");
////         stack.pop();
//        stack.push(30);
//        System.out.println("30 is pushed");
//        stack.pop();
//
//        stack.pop();
//        stack.pop();
//        stack.push(40);
//        stack.pop();
//        // System.out.println("40 is pushed");
//
//        //System.out.println("peeked element is :   " + stack.peek());
//        stack.peek();
        stack.push(10);
        System.out.println("10 is pushed");
        stack.push(20);
        System.out.println("20 is pushed");
        stack.push(30);
        System.out.println("30 is pushed");
        stack.push(40);
        //  System.out.println("40 is pushed");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(2);
        System.out.println("2 is pushed");
        stack.peek();
        stack.pop();
        stack.pop();
        stack.peek();

        stack.push(2);
        System.out.println("\"2 is pushed\"");
        stack.push(32);
        System.out.println("\"32 is pushed\"");
        stack.push(42);
        stack.pop();
        System.out.println("\"42 is pushed\"");
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }

}
