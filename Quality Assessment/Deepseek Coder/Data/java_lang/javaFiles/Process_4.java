import java.io.OutputStream;
import java.io.PrintStream;

public class Process_4 {
    public static void main(String[] args) throws Exception {
        Process process = new ProcessBuilder("echo", "Hello, World!").start();
        OutputStream outputStream = process.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        printStream.println("Hello, World!");
        printStream.close();

        int exitCode = process.waitFor();
        System.out.println("Process exited with code " + exitCode);
    }
}
