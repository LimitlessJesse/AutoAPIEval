import java.io.IOException;

public class Runtime_5 {
    public static void main(String[] args) {
        try {
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("ls");
            pr.waitFor();
            System.out.println("Process exit value: " + pr.exitValue());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
