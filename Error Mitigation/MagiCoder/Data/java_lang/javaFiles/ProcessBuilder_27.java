import java.io.IOException;
import java.util.Arrays;

public class ProcessBuilder_27 {
    public static void main(String[] args) {
        ProcessBuilder builder = new ProcessBuilder();
        builder.command("ls", "-l");

        try {
            Process process = builder.start();
            int exitCode = process.waitFor();
            System.out.println("Process exited with code " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
