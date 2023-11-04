package ads;
//
//public class queueImplementation {
//
//    final int size = 3;
//    int arr[] = new int[size];
//    int front = 0;
//    int rear = 0;
//
//    public void push(int value) {
//        if (rear == size) {
//            System.out.println("Queue is full-->");
//            //  return;
//        } else {
//            arr[rear] = value;
//            rear++;
//        }
//    }
//
//    public void pop() {
//
//        if (rear == front) {
//            if (front == size) {
//                rear = front = 0;
//            }
//            System.out.println("queue is empty");
//            return;
//
//        }
//        System.out.println("poped element is " + arr[front]);
//        front++;
//
//    }
//
//    public static void main(String[] args) {
//        queueImplementation qi = new queueImplementation();
////       
//        qi.push(10);
//        System.out.println("10 is pushed");
//        qi.push(20);
//        System.out.println("20 is pushed");
//        qi.push(30);
//        System.out.println("30 is pushed");
//        qi.pop();
//        qi.push(40);
//        System.out.println("40 is pushed");
//        qi.pop();
//        qi.pop();
//        qi.pop();
//
//    }
//}

 
public class queueimplementation { 
    final int size=3; 
    int arr[] = new int [size]; 
    int front=0; 
    int rear=0; 
    public void push(int value){ 
        if((rear==size-1 && front==0 )|| rear==front-1){ 
             
            System.out.println("Queue is full.."); 
            return; 
        } 
        arr[rear]=value; 
        rear++; 
    } 
    public void pop() 
            { 
                if(front==rear){ 
                    System.out.println("queue id empty"); 
                    return; 
                     
                } 
                else{ 
                    System.out.println("Popped element is "+arr[front]); 
                    for(int i=0;i<rear-1;i++) 
                    arr[i]=arr[i+1]; //increse 
                } 
                if(rear<size){ 
                    arr[rear]=0; 
                } 
                rear--; 
            } 
    public static void main(String[] args) { 
        queueimplementation qi=new queueimplementation(); 
        qi.push(10); 
        System.out.println("10 is push..."); 
        qi.push(20); 
        System.out.println("20 is push...."); 
        qi.push(30); 
        System.out.println("30 is push..."); 
        qi.pop(); 
        qi.push(40); 
        System.out.println("40 is push..."); 
        qi.pop(); 
        qi.pop(); 
        qi.pop(); 
    } 
}