import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessBuilder_5 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("ls");
        
        try {
            Process process = processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT).start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
