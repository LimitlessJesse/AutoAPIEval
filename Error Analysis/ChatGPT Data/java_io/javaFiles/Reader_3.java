import java.io.FileReader;
import java.io.IOException;

public class Reader_3 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt");
            long skipResult = skip(reader, 5);
            System.out.println("Skipped " + skipResult + " characters");
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static long skip(FileReader reader, long n) throws IOException {
        return reader.skip(n);
    }
}
