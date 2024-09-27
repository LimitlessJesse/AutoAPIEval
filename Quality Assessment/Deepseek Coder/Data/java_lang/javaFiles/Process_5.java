import java.io.IOException;

public class Process_5 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "test.txt");
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
