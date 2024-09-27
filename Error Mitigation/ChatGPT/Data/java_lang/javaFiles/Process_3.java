import java.io.InputStream;

public class Process_3 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("command");
        try {
            Process process = processBuilder.start();
            InputStream errorStream = process.getErrorStream();
            // Use errorStream to read error output from the subprocess
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
