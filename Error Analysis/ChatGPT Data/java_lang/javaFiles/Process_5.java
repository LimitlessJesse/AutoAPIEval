import java.io.IOException;

public class Process_5 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls");
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
