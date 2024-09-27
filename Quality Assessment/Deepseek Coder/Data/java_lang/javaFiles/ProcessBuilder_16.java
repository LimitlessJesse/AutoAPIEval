import java.io.IOException;

public class ProcessBuilder_16 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.inheritIO();

        try {
            Process process = processBuilder.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
