import java.io.File;
import java.io.IOException;

public class ProcessBuilder_14 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        File workingDirectory = new File("path/to/your/directory");
        processBuilder.directory(workingDirectory);
        try {
            Process process = processBuilder.start();
            // do something with the process
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
