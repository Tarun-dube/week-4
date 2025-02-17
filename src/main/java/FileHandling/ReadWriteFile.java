package FileHandling;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        try{
            FileInputStream fr=new FileInputStream("input.txt");
            FileOutputStream fo=new FileOutputStream("output.txt");

            int ch;
            while((ch=fr.read())!=-1){
                fo.write(ch);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file written");
    }
}
