import java.io.*;

public class FilterReader_5 {
    public static void main(String[] args) {
        try {
            // Create a FileReader
            FileReader fileReader = new FileReader("example.txt");
            
            // Wrap FileReader in FilterReader
            FilterReader filterReader = new BufferedReader(fileReader);
            
            // Close the FilterReader
            filterReader.close();
            
            System.out.println("File closed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
