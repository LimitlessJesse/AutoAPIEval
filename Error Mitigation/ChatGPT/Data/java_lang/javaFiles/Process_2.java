import java.io.IOException;

public class Process_2 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls");
            int exitValue = process.exitValue();
            System.out.println("Exit Value: " + exitValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
