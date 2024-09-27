import java.io.File;
import java.io.IOException;

public class ProcessBuilder_7 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ls", "-l");

        File errorFile = new File("error.txt");
        processBuilder.redirectError(errorFile);

        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Exited with " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
