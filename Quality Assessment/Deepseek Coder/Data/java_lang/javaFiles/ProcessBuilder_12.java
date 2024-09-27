import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ProcessBuilder_12 {
    public static void main(String[] args) {
        List<String> commands = Arrays.asList("ls", "-l");
        ProcessBuilder processBuilder = new ProcessBuilder(commands);
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
