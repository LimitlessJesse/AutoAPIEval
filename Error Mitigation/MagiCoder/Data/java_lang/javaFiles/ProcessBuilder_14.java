import java.io.IOException;

public class ProcessBuilder_14 {
    public static void main(String[] args) {
        ProcessBuilder builder = new ProcessBuilder();
        builder.command("ls", "-l");
        try {
            Process process = builder.start();
            int exitCode = process.waitFor();
            System.out.println("Process exited with code " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
