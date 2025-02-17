package FilterStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextFileConverter {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            System.out.println("File conversion completed successfully!");
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}