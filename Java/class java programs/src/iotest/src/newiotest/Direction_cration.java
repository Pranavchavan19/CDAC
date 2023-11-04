
package newiotest;

import java.nio.*;
import java.nio.file.*;


public class Direction_cration {
    public static void main(String[] args) {
        try{
            Path p=Paths.get("C:\\Users\\91766\\Desktop\\panu1.txt");
            Path p1=Files.createFile(p);
            System.out.println("File create Successfully");
        
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
}
