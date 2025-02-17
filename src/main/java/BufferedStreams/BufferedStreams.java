package BufferedStreams;

import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input1.txt"));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output1.txt"))) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
                System.out.println("File copied successfully with buffering.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime)  + "ns");

        startTime = System.nanoTime();

        try{
            FileInputStream fr=new FileInputStream("input1.txt");
            FileOutputStream fo=new FileOutputStream("output2.txt");

            int ch;
            while((ch=fr.read())!=-1){
                fo.write(ch);

            }
            System.out.println("File copied successfully with buffering.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        endTime = System.nanoTime();
        System.out.println("Time taken normal file streams: " + (endTime - startTime)  + "ns");
    }
}
