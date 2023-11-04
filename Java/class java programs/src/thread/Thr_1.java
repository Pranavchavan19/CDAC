package thread;

public class Thr_1 extends Thread {// first way to create thread 2. import thread karun

    public void run() {
        for (int i = 0; i < 10; i++) {
//            if(this.getName().equals("Second"))
//            {
//                try{
//                sleep(1000);// interepted exception yeto
//                }
//                catch(Exception e)
//                {}
//            }
            System.out.println(this.getName() + " " + i + " ");// java supports multithreading
       }

    }

    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());// deamon thread
        System.out.println(Thread.currentThread());
        Thr_1 t1 = new Thr_1();
        Thr_1 t2 = new Thr_1();// newly born thread stage

        t1.setName("First");
        t2.setName("Second");
        

        t1.start();
        t2.start();// achieve ready to run stage
//        t2.setPriority(10);// its only 
//        System.out.println(t2.getPriority());
//        System.out.println(t1.getPriority());
        try{
        t1.join();
        t2.join();// first thread execute zalavr mg next execute krto
        }
        catch(Exception e){}
       
        System.out.println("Main thread Exited");

    }

}
