import java.io.IOException;

public class Runtime_1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("ls -l");
            System.out.println("Process ID: " + process.pid());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
