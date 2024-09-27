import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStream_3 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"))) {
            long n = 10;
            long skipped = bis.skip(n);
            System.out.println("Skipped " + skipped + " bytes.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO Exception");
            e.printStackTrace();
        }
    }
}
