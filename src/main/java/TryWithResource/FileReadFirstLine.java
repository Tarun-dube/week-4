package TryWithResource;

import java.io.*;

public class FileReadFirstLine {
    public static void main(String[] args) {
        File file = new File("info.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
