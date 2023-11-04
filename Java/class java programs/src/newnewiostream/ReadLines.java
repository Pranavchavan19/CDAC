package newnewiostream;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class ReadLines {
//    void readLines() throws IOException{
//        String str;
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Provide sentences to read its Lines");
//       do{
//           str=br.readLine();
//           System.out.println(str);
//       }
//       while(!str.equals("stop"));
//    }
//    public static void main(String[] args) throws IOException {
//        ReadLines rc=new ReadLines();
//        rc.readLines();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
    void readLines() throws IOException{
        String str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide sentences to read its Lines");
       do{
           str=br.readLine();
           System.out.println(str);
       }
       while(!str.equals("stop"));
    }
    public static void main(String[] args) throws IOException {
        ReadLines rc=new ReadLines();
        rc.readLines();
    }
}
