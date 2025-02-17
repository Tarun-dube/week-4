package ReadLargeFile;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ErrorLogFilter {
    public static void main(String[] args) {
        String filePath = "large_log.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}


