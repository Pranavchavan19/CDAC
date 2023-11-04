
//package newiotest.neoysest;
//import java.nio.*;
//import java.nio.file.*;
//
//public class DirectoryCreation {
//    public static void main(String[] args) {
//        try{
//        Path p=Paths.get("D:\\Data Base");
//                path p1=Files.createFile(p)
//                System.out.println("Directory created");
//        
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        
//    }
//    
//}
package newiotest.neoysest;
import java.nio.*;
import java.nio.file.*;
public class DirectoryCreation {
    public static void main(String[] args) {
        try{
            Path p=Paths.get("C:\\Users\\91766\\Desktop\\pranav.txt");
//            Path p1=Files.createDirectories(p);
            Path p1=Files.createFile(p);
            System.out.println("File created");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

