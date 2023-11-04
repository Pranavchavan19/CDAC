package read_line_paragraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class para {

    private int i;

    void show() throws IOException {
        String str[] = new String[50];
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("provide paragraph");
        for (int i = 0; i < str.length; i++) {
            str[i] = b.readLine();
            if (str[i].equals("stop")) {
                break;

            }

        }

        //System.out.println(str[i]);
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop")) {

                break;

            }
            System.out.println(str[i]);
        }
    }
}
    public class read_paragraph {

        public static void main(String[] args) throws IOException {
            para v = new para();
            v.show();
        }

    }

