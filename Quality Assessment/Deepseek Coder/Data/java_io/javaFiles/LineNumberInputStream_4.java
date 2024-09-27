import java.io.*;

public class LineNumberInputStream_4 {
    public static void main(String[] args) throws IOException {
        LineNumberInputStream lnis = new LineNumberInputStream(new ByteArrayInputStream("Hello\nWorld\n".getBytes()));
        int lineNumber;
        while ((lineNumber = lnis.getLineNumber())!= -1) {
            int readByte = lnis.read();
            if (readByte == -1) {
                break;
            }
            System.out.println("Line number: " + lineNumber + ", Byte: " + (char) readByte);
        }
    }
}
