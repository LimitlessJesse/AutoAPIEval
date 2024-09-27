import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.ByteArrayInputStream;

public class SequenceInputStream_7 {
    public static void main(String[] args) {
        try {
            ByteArrayInputStream input1 = new ByteArrayInputStream("Hello".getBytes());
            ByteArrayInputStream input2 = new ByteArrayInputStream("World".getBytes());
            SequenceInputStream sis = new SequenceInputStream(input1, input2);

            int i;
            while ((i = sis.read())!= -1) {
                System.out.print((char) i);
            }

            sis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
