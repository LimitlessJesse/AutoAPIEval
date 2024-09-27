import java.io.*;

public class SequenceInputStream_1 {
    public static void main(String[] args) throws IOException {
        InputStream input1 = new ByteArrayInputStream("Hello".getBytes());
        InputStream input2 = new ByteArrayInputStream("World!".getBytes());
        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

        int available = sequenceInputStream.available();
        System.out.println("Number of bytes available: " + available);

        sequenceInputStream.close();
    }
}
