import java.io.IOException;

public class Process_4 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("notepad.exe");
            int exitValue = process.waitFor();
            System.out.println("Exit Value: " + exitValue);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
