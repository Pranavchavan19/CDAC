package collection.set;

import java.util.*;

public class BackupSet {

    public static void main(String[] args) {// set madhe backup madhe add kele tr origional madhe change hot nahi
        Set<Integer> origionalset = new HashSet<>();
        origionalset.add(100);
        origionalset.add(200);
        origionalset.add(300);

        //  Set<Integer>  backupSet=Collections.unmodifiableSet(new HashSet<>(origionalset));
        Set<Integer> backupSet = new HashSet<>(origionalset);
        System.out.println(" Origional set :  "+origionalset);
        System.out.println(" backup set :  "+backupSet);
        try {
            backupSet.add(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" Origional set :  "+origionalset);
        System.out.println(" backup set :  "+backupSet);
    }

}
