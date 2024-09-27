import java.lang.Process;

public class Process_1 {
    public static void main(String[] args) {
        Process process = new ProcessBuilder("notepad.exe").start();
        process.destroy();
    }
}
