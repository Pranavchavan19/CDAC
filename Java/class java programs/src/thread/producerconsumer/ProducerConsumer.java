package thread.producerconsumer;

import java.nio.Buffer;
import java.util.Vector;
//import thread.Thr_1;

class Producer implements Runnable {

    private final Vector buffer;
    private final int SIZE;

    public Producer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }

    public void produce(int i) throws InterruptedException {
        if (buffer.size() == SIZE) {
            synchronized (buffer){
            System.out.println("The buffer is full and waithing conusme to iteam" +" "+ buffer.size());

           buffer.wait();//blocked production
        }
        }
        synchronized(buffer){
        buffer.add(i);
        buffer.notifyAll();//unblock consumer
        }
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                produce(i);
            } catch (Exception e) {
            }
            System.out.println("Produced item " +" "+ i+" ");
        }
    }

}

class Consumer implements Runnable {

    private final Vector buffer;
    private final int SIZE;

    public Consumer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }

    public int consume() throws InterruptedException {
      if (buffer.size() == 0) {
          synchronized(buffer){
            System.out.println("The buffer is Empty and waithing produce to iteam" + " "+buffer.size());

               buffer.wait();//blocked consumer
        }
      }
      synchronized(buffer){
      buffer.notifyAll();//unblock producer
      return (Integer)buffer.remove(0);
      }
    }

    @Override
    public void run() {
        while(true)// for infinite times loop chalega
        {
            try{
            System.out.println( "consumed item "+ consume());
              Thread.sleep(100);
            }
          
            catch(Exception e){}
            
        }
        
    }

}

public class ProducerConsumer {

    public static void main(String[] args) {
        Vector buffer = new Vector();
        int size = 5;

        Producer prod = new Producer(buffer, size);
        Consumer cons = new Consumer(buffer, size);
        
       Thread t1=new Thread(prod);
       Thread t2=new Thread(cons);
       
       
       t1.start();
       t2.start();
       
        
    }

}
