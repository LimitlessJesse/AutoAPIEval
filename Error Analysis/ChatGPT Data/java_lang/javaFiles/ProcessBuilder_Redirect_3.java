import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class ProcessBuilder_Redirect_3 {
    public static void main(String[] args) {
        File outputFile = new File("output.txt");

        ProcessBuilder processBuilder = new ProcessBuilder("echo", "Hello World!");
        processBuilder.redirectOutput(Redirect.to(outputFile));

        try {
            processBuilder.start();
            System.out.println("Output redirected to file: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error redirecting output to file.");
            e.printStackTrace();
        }
    }
}
