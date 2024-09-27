import java.lang.ProcessBuilder.Redirect;

public class ProcessBuilder_Redirect_1 {
    public static void main(String[] args) {
        // Create a ProcessBuilder object
        ProcessBuilder processBuilder = new ProcessBuilder("ls");

        // Specify the file to redirect the standard output
        processBuilder.redirectOutput(Redirect.from(new File("output.txt")));

        // Start the process
        Process process;
        try {
            process = processBuilder.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
