import java.io.InputStream;
import java.io.IOException;

public class Process_3 {
    public static void main(String[] args) {
        try {
            // Create a new process
            Process process = new ProcessBuilder("echo", "Hello, World!").start();

            // Get the input stream from the process
            InputStream inputStream = process.getInputStream();

            // Read the output of the process
            int read = inputStream.read();
            while (read!= -1) {
                System.out.print((char) read);
                read = inputStream.read();
            }

            // Wait for the process to finish
            int exitCode = process.waitFor();
            System.out.println("\nExit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
