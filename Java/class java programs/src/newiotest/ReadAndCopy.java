//
//package newiotest;
//
//
//public class ReadAndCopy {
//    void copyFile(){
//        int i;
//        try(){
//        do{
//        i=fin.read();
//        
//        }
//        while(i!=-1);
//        fout.write(i);
//        }
//    catch(Exception e)
//    {
//        System.out.println(e.getMessage());
//    }
//    
//    }
//    public static void main(String[] args) {
//        ReadAndCopy cf=new ReadAndCopy();
//        cf.copyFile();
//    }
//    
//}
package newiotest;
import java.io.*;
public class ReadAndCopy {
    void copyFile(){
        int i;
        try(FileInputStream fin=new FileInputStream("C:\\Users\\91766\\Pictures\\Camera Roll\\nowpic.jpg");
          FileOutputStream fout=new FileOutputStream("C:\\Users\\91766\\Desktop\\nowpic.jpg")){
        do{
            i=fin.read();
            fout.write(i);
        }while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ReadAndCopy cf=new ReadAndCopy();
        cf.copyFile();
    }
}
