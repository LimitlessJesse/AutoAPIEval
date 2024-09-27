import java.io.IOException;

public class ProcessBuilder_18 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("ls", "-l");
        pb.inheritIO();
        try {
            Process process = pb.start();
            int exitCode = process.waitFor();
            System.out.println("Exited with error code : " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
