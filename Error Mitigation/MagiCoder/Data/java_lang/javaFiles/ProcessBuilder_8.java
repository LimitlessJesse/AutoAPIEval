import java.io.File;
import java.io.IOException;

public class ProcessBuilder_8 {
    public static void main(String[] args) {
        File file = new File("output.txt");
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ls", "-l");
        processBuilder.redirectOutput(file);
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
