import java.io.IOException;

public class ProcessBuilder_2 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("command");
        
        try {
            Process process = processBuilder.start();
            System.out.println("Process started successfully");
        } catch (IOException e) {
            System.out.println("Error starting process: " + e.getMessage());
        }
    }
}
