import java.io.IOException;

public class Process_2 {
    public static void main(String[] args) {
        try {
            Process process = new ProcessBuilder("notepad.exe").start();
            process.destroy();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
