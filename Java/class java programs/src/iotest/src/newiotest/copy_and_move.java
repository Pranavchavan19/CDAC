
package newiotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class copy_and_move {
    public static void main(String[] args) {
        try
        {
            Path path=Paths.get("C:\\Users\\91766\\Desktop\\Assignment\\java\\pranav\\Inner_class\\Test_Annonymous.java");
            Path pathcopy=Paths.get("C:\\Users\\91766\\Desktop\\java\\test.java");
            Files.copy(path, pathcopy );
            System.out.println("File copied successfully-->");
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
