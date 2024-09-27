import java.lang.ProcessBuilder;

public class ProcessBuilder_13 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("echo", "Hello, World!");
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
