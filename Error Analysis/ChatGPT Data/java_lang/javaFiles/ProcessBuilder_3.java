import java.io.IOException;

public class ProcessBuilder_3 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("ls", "-la");
        Process process = processBuilder.start();
    }
}
