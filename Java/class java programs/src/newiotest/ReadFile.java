
package newiotest;

import java.io.FileInputStream;
import javax.imageio.stream.FileImageInputStream;


public class ReadFile {
    void readFile(){
        // FileInputStream fin=null ;
         int i;
         //try with resource
        try( FileInputStream fin=new FileInputStream("C:\\Users\\91766\\Desktop\\Assignment\\java\\pranav\\Inner_class\\Test_Annonymous.java")){
           //  try(FileInputStream fin=new FileInputStream("C:\\Cdac_2023\\JaggedDemo.java")){
       
       do{
      i= fin.read();
           System.out.print((char)i); //typecasting 
       }
              while(i!=-1);  }
        
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ReadFile rf=new ReadFile();
        rf.readFile();
    }
    
}
