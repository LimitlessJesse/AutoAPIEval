import java.io.LineNumberInputStream;

public class LineNumberInputStream_4 {
    public static void main(String[] args) {
        LineNumberInputStream stream = new LineNumberInputStream(System.in);
        try {
            long skippedBytes = stream.skip(10);
            System.out.println("Skipped " + skippedBytes + " bytes.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
