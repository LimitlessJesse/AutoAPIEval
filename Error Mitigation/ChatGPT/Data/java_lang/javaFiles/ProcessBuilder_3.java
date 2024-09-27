import java.util.List;
import java.util.ArrayList;

public class ProcessBuilder_3 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("ls", "-l");
        List<String> command = processBuilder.command();
        System.out.println(command);
    }
}
