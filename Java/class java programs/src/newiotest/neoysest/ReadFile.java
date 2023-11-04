
//package newiotest.neoysest;
//import java.nio.*;
//import java.nio.file.*;
//import java.util.List;
//
//
//public class ReadFile {
//    public static void main(String[] args) {
//        try{
//        
//        Path path=Paths.get(uri);
//        Files.readAllLines(path);
//        List<String> 1st=Files.readAllLines(path);
//        for(String str: 1st)
//        {
//            System.out.println(str);
//        
//        }
//        
//        
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//    
//}
package newiotest.neoysest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        try{
        Path path=Paths.get("C:\\Users\\91766\\Desktop\\pranav.txt");
        List<String> lst=Files.readAllLines(path);
        for(String str:lst)
        {
            System.out.println(str);
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
