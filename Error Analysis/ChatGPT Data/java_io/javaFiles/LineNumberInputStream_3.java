import java.io.LineNumberInputStream;

public class LineNumberInputStream_3 {
    public static void main(String[] args) {
        try {
            LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(System.in);
            int bytesAvailable = lineNumberInputStream.available();
            System.out.println("Bytes available for reading: " + bytesAvailable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
