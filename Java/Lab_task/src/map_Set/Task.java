/*Q1. .Write a java program to Create a HashMap called populationMap,
stores population data for several cities, retrieves and prints the population
of a specific city, iterates through the map to print all city populations,
removes a city from the map, and checks if a city exists in the map.
*/
package map_Set;

import java.util.HashMap;
import java.util.Map;




public class Task {
    
    public static void main(String[] args) {
      //  Map<Integer,String> j=new HashMap<>();
        Map<Integer,String> mp=new HashMap<>();
        mp.put(20000, "pune");
        mp.put(27000, "nagpur");
        mp.put(90000, "delhi");
        mp.put(299000, "kolkata");
        
        mp.put(276000, "patna");
        
   //     System.out.println(mp);
        
        for(Integer i:mp.keySet())
        {
            String val=mp.get(i);
            System.out.println("Pupulation = "+i+" String = "+val);
          
         
        }
        System.out.println("****************************************************");
        mp.remove(20000);
           for(Integer i:mp.keySet())
        {
            String val=mp.get(i);
            System.out.println("Pupulation = "+i+" String = "+val);
      
         
        }
        System.out.println("************************************************************");
           System.out.println(   mp.containsValue("pune"));
        
    }
    
}
