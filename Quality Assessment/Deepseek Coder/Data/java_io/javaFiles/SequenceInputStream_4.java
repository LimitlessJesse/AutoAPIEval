import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream_4 {
    public static void main(String[] args) {
        byte[] array1 = "Hello, ".getBytes();
        byte[] array2 = "World!".getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(array1);
        ByteArrayInputStream input2 = new ByteArrayInputStream(array2);

        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

        byte[] buffer = new byte[10];
        int readBytes;

        try {
            while ((readBytes = sequenceInputStream.read(buffer, 0, buffer.length))!= -1) {
                System.out.print(new String(buffer, 0, readBytes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
