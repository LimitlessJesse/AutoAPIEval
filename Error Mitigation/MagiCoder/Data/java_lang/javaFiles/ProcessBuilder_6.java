import java.io.File;
import java.io.IOException;

public class ProcessBuilder_6 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        ProcessBuilder pb = new ProcessBuilder();
        try {
            pb.redirectInput(file);
            Process process = pb.start();
            // do something with the process
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
