import java.lang.ProcessBuilder;
import java.util.ArrayList;
import java.util.List;

public class ProcessBuilder_4 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        List<String> command = new ArrayList<>();
        command.add("ls");
        command.add("-l");
        processBuilder.command(command);
    }
}
