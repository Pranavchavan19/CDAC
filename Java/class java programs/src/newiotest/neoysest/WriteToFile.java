
package newiotest.neoysest;

import java.nio.*;
import java.nio.file.*;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        try{
         Path path =Paths.get("C:\\Users\\91766\\Desktop\\pranav.txt");
         String content="soft polynomials Pvt Ltd,Nagpur";
         for(int i=0;i<10;i++)
        Files.write(path, content.getBytes(),StandardOpenOption.APPEND);//APPEND KRTO
            System.out.println("Completed");
        }
        catch(Exception e)
        {
        
            System.out.println(e.getMessage());
        }
    }
    
}
