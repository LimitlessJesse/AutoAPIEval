import java.io.IOException;

public class Runtime_3 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls -l");
            process.waitFor();
            System.out.println("Command executed successfully.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
