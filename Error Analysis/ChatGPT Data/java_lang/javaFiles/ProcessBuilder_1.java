import java.io.File;
import java.io.IOException;

public class ProcessBuilder_1 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("ls");
        File directory = new File("/Users/user/Desktop");
        pb.directory(directory);
        
        try {
            Process process = pb.start();
            int exitCode = process.waitFor();
            System.out.println("Process executed with exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
