package PipedStream;

import java.io.*;

public class PipedStreamExample {
    public static void main(String[] args) {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis;

        try {
            pis = new PipedInputStream(pos);
        } catch (IOException e) {
            System.err.println("Error creating piped streams: " + e.getMessage());
            return;
        }

        Thread writerThread = new Thread(new WriterTask(pos));
        Thread readerThread = new Thread(new ReaderTask(pis));

        writerThread.start();
        readerThread.start();
    }
}

class WriterTask implements Runnable {
    private PipedOutputStream pos;

    public WriterTask(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pos))) {
            String[] messages = {"Hello", "This is a piped stream example", "Goodbye"};
            for (String msg : messages) {
                writer.write(msg);
                writer.newLine();
                writer.flush();
                Thread.sleep(500); // Simulate processing time
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Writer error: " + e.getMessage());
        }
    }
}

class ReaderTask implements Runnable {
    private PipedInputStream pis;

    public ReaderTask(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pis))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reader received: " + line);
            }
        } catch (IOException e) {
            System.err.println("Reader error: " + e.getMessage());
        }
    }
}
