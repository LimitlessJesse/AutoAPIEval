import java.io.*;

public class SequenceInputStream_3 {
    public static void main(String[] args) {
        InputStream input1 = new ByteArrayInputStream("Hello".getBytes());
        InputStream input2 = new ByteArrayInputStream("World!".getBytes());
        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

        int i;
        while ((i = sequenceInputStream.read())!= -1) {
            System.out.print((char) i);
        }

        sequenceInputStream.close();
    }
}
