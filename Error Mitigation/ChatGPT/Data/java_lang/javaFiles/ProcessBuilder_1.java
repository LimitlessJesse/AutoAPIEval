import java.lang.ProcessBuilder;

public class ProcessBuilder_1 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("ls");
        pb.inheritIO();
    }
}
