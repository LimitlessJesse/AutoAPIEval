import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder;

public class ProcessBuilder_Redirect_5 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("echo", "Hello World");
        File outputFile = new File("output.txt");
        
        // Redirect the output of the process to append to a file
        processBuilder.redirectOutput(ProcessBuilder.Redirect.appendTo(outputFile));
        
        try {
            Process process = processBuilder.start();
            process.waitFor();
            
            // Display the contents of the output file
            System.out.println("Contents of output file:");
            System.out.println(java.nio.file.Files.readString(outputFile.toPath()));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
