package ReadUserInput;

import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output4.txt")))
        {

            String line;

            while (!(line=br.readLine()).equalsIgnoreCase("exit")) {
                    bw.write(line);
                    bw.newLine();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
