
package collection.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;



public class Concourrency {
    public static void main(String[] args) {
       // HashMap<Integer,String> mp=new HashMap<>(); //
       ConcurrentHashMap<Integer,String> mp=new ConcurrentHashMap<>();// single thread ko multiple thread convert
        mp.put(101, "Ramesh");
        mp.put(102, "Suresh");
        mp.put(103, "Dinesh");
        
        Runnable task=() ->   { // runnable interface
            for(int i=104;i<=106;i++)
            {
            mp.put(i, " value "+i);
            }
        };
        Thread th1=new Thread(task);
        Thread th2=new Thread(task);
        Thread th3=new Thread(task);
        th1.start();
        th2.start();
        th3.start();
        
        try{
        th1.join();
        th2.join();
        th3.join();
        }
        catch(Exception e)
        {System.out.println(e);}
        System.out.println(  mp);
        
    }
}
