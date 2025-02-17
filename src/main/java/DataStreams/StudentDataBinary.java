package DataStreams;

import java.io.*;

public class StudentDataBinary {
    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        // Writing student data to binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.9);

            System.out.println("Student data written successfully!");
        } catch (IOException e) {
            System.err.println("Error writing student data: " + e.getMessage());
        }

        // Reading student data from binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("Reading student data:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.printf("Roll No: %d, Name: %s, GPA: %.2f%n", rollNumber, name, gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading student data: " + e.getMessage());
        }
    }
}
