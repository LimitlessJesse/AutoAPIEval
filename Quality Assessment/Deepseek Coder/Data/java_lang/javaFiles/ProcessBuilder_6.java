import java.io.File;
import java.io.IOException;

public class ProcessBuilder_6 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("echo", "Hello, World!");
        processBuilder.redirectOutput(new File("output.txt"));

        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Process exited with code " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
