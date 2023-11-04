
package iotest;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class read
{
    
    void show() throws IOException
    {
        char c;
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("provide sentene to read its character");
do{
    c=(char)b.read();
    System.out.println(c);
}
while(c!='f');
    }


}

public class ReadCharacter {
    public static void main(String[] args) throws IOException {
        read f=new read();
        f.show();
    }
    
}
