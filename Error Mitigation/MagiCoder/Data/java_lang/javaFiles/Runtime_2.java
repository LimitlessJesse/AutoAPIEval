import java.io.IOException;

public class Runtime_2 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        String[] command = {"/bin/bash", "-c", "echo Hello, World!"};
        try {
            Process process = runtime.exec(command);
            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
