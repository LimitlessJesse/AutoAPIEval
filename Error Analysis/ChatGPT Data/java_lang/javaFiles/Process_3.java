import java.io.IOException;

public class Process_3 {
    public static void main(String[] args) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("notepad.exe");
            int exitValue = process.waitFor();
            System.out.println("Process exited with value: " + exitValue);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
