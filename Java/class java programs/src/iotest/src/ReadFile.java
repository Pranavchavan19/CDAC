
import java.io.FileInputStream;
import javax.imageio.stream.FileCacheImageInputStream;





class file
{void show()
       
{
  try( FileInputStream oi = new FileInputStream("D:\\Data Base\\cursor progrm.sql") ){
    
   int i;
  do{
  i=oi.read();
      System.out.print((char)i);
  }
  while(i!=-1);
  
  
  
  
  
  
  
  }
  catch (Exception e)
  {
      System.out.println(e);
  }

}

}

public class ReadFile {
    public static void main(String[] args) {
        file b= new file();
        b.show();
    }
    
}
