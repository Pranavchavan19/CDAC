
package newiotest.neoysest;

import java.nio.*;
import java.nio.file.*;
import java.util.List;
public class CopyAndMove {
    public static void main(String[] args) {
        try{
        Path path=Paths.get("C:\\Users\\91766\\Desktop\\Assignment\\java\\pranav\\Inner_class\\Test_Annonymous.java");//copy path
        Path pathcopyy=Paths.get("C:\\Users\\91766\\Desktop\\vaibhav\\test.java");  
        Files.copy(path, pathcopyy);
            System.out.println("Completed");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        
        }
    }
    
}
