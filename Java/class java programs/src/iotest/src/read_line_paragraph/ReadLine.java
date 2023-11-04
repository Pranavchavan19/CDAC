package read_line_paragraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class read {

    void show() throws IOException {
        String str;
        BufferedReader v = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("provoide sentence to read-->");
        do {
            str = v.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));

    }

}

public class ReadLine {

    public static void main(String[] args) throws IOException {
        read f = new read();
        f.show();
    }

}
