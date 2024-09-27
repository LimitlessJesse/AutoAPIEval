import java.io.File;
import java.io.IOException;

public class ProcessBuilder_5 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("echo", "Hello, World!");

        File input = new File("input.txt");
        processBuilder.redirectInput(input);

        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Process exited with code " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
