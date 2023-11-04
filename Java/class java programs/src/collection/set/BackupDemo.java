package collection.set;

import java.util.*;

public class BackupDemo {

    public static void main(String[] args) {
        List<Integer> Origionallst = new ArrayList<>();// backup madhee change kele ki te reflect hot origionally madhe
        Origionallst.add(100);
        Origionallst.add(200);
        Origionallst.add(300);
        //List<Integer> backuplist=Origionallst.subList(0, Origionallst.size());
        List<Integer> backuplist = Origionallst.subList(0, 3);//both are same
        System.out.println(" Origional set :  "+Origionallst);

        System.out.println(" backup set :  "+backuplist);

        backuplist.add(500);
        backuplist.add(700);
      //  backuplist.remove(2);
        System.out.println(" Origional set :  "+Origionallst);

        System.out.println(" backup set :  "+backuplist);

    }

}
