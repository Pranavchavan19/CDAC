package iotest;

import java.io.FileInputStream;
//import javax.imageio.stream.FileImageInputStream;
//import javax.imageio.stream.FileImageInputStream;

class file {

    int i;

    void show() {
        try (FileInputStream on = new FileInputStream("D:\\Cdac java program\\demo1.java")) {

            do {
                i = on.read();
                System.out.print((char) i); //typecasting 
            } while (i != -1);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

public class ReadFile {

    public static void main(String[] args) {
        file k = new file();
        k.show();

    }

}
