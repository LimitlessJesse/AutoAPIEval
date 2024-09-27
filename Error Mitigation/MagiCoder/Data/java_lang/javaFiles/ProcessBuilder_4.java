import java.io.File;
import java.io.IOException;

public class ProcessBuilder_4 {
    public static void main(String[] args) {
        File file = new File("error.txt");
        ProcessBuilder pb = new ProcessBuilder("ls", "-l");
        pb.redirectError(file);
        try {
            Process p = pb.start();
            int errCode = p.waitFor();
            System.out.println("Process exited with error code " + errCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
