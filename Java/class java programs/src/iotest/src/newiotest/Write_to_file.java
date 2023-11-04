
package newiotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Write_to_file {
    public static void main(String[] args) {
        try{
           Path path=Paths.get("C:\\Users\\91766\\Desktop\\new.txt");
           String content="change is the law of universe";
           for(int i=0;i<1;i++)
           
             Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
               System.out.println("file write completly");
 
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }   
    }  
}
