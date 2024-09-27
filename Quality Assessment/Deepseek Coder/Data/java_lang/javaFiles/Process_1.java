import java.io.IOException;

public class Process_1 {
    public static void main(String[] args) {
        try {
            Process process = new ProcessBuilder("ls").start();
            process.waitFor();
            int exitValue = process.exitValue();
            System.out.println("Exit value: " + exitValue);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
