package ByteArrayStream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageByteConverter {
    public static void main(String[] args) {
        String inputFile = "input.jpg";
        String outputFile = "output.jpg";

        try {
            byte[] imageBytes = convertImageToByteArray(inputFile);
            writeByteArrayToImage(imageBytes, outputFile);
            verifyFiles(inputFile, outputFile);
        } catch (IOException e) {
            System.err.println("Error processing image: " + e.getMessage());
        }
    }

    private static byte[] convertImageToByteArray(String filePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Files.copy(new File(filePath).toPath(), baos);
            return baos.toByteArray();
        }
    }

    private static void writeByteArrayToImage(byte[] imageBytes, String filePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    private static void verifyFiles(String original, String copy) throws IOException {
        byte[] originalBytes = Files.readAllBytes(new File(original).toPath());
        byte[] copiedBytes = Files.readAllBytes(new File(copy).toPath());

        if (Arrays.equals(originalBytes, copiedBytes)) {
            System.out.println("Verification successful: The files are identical.");
        } else {
            System.out.println("Verification failed: The files are different.");
        }
    }
}
