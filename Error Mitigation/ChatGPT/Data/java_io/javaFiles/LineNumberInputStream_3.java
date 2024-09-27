import java.io.LineNumberInputStream;
import java.io.IOException;

public class LineNumberInputStream_3 {
    public static void main(String[] args) {
        LineNumberInputStream inputStream = new LineNumberInputStream(System.in);
        
        try {
            long bytesSkipped = inputStream.skip(5);
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            System.out.println("An error occurred while skipping bytes.");
            e.printStackTrace();
        }
    }
}
