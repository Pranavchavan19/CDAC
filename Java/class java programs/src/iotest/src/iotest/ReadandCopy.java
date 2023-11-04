
package iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class read
{
  void show(){
      int i;
      try(FileInputStream h=new FileInputStream("C:\\Users\\91766\\Pictures\\Camera Roll\\now1.jpg");
              FileOutputStream h1=new FileOutputStream("C:\\Users\\91766\\Desktop\\no.jpg")){
          do{
              i=h.read();
              h1.write(i);
              
          }
          while(i!=-1);
      
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
          
  
  
  }

}

public class ReadandCopy {
    public static void main(String[] args) {
        read n=new read();
        n.show();
    }
    
}
