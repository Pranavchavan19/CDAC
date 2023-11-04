
package thread;

// dusari class la inheriate karaycha asel tr mostly prefrebble
public class Thr_2 implements Runnable{// interface inheritae by Runnable Runnable  (for only single thread sathi use krto   dusari  calss cha thread sathi prefebale)
  String name;

  
  
    public Thr_2(String name) {
        this.name = name;
    }
  
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println(this.name+" " +i);
        }
    }
     public static void main(String[] args) {
         Thr_2 t1=new Thr_2("one");// obj of runnable
         Thr_2 t2=new Thr_2("two");
         Thread th1 =new Thread(t1);
         Thread th2 =new Thread(t2);// creating thread
         th1.start();
         th2.start();
         
        
    }
    
}
