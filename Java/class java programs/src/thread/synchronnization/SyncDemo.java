package thread.synchronnization;

public class SyncDemo implements Runnable {

    static int x=0 ;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                x++;//1
                x--;//0
            }
        }
    }

    public static void main(String[] args) {
        SyncDemo sd1 = new SyncDemo();
        Thread th[] = new Thread[1000];
        for (int i = 0; i < th.length; i++) {
            th[i] = new Thread(sd1);
            th[i].start();
        }
        System.out.println(" Final value of x is = " + x);
    }

}
