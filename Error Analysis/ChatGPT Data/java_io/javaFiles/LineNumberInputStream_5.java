import java.io.LineNumberInputStream;

public class LineNumberInputStream_5 {
    public static void main(String[] args) {
        LineNumberInputStream inputStream = new LineNumberInputStream(System.in);
        try {
            // Mark the current position with a read limit of 100
            inputStream.mark(100);
            
            // Perform some operations
            
            // Reset the stream to the previously marked position
            inputStream.reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
