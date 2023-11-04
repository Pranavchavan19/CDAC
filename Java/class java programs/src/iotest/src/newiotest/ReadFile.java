package newiotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Users\\91766\\Desktop\\new.txt");
            List<String> f = Files.readAllLines(path);
            for (String str : f) {
                System.out.println(str);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
