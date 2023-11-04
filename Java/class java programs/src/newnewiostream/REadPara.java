package newnewiostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REadPara {

    private int i;

    void readpara() throws IOException {
        String str[] = new String[100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("provide sentene to read its character");
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }

        System.out.println(str[i]);
        for (int i = 0; i < str.length; i++) {
            // str[i]= br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        REadPara rp = new REadPara();
        rp.readpara();
    }

}
