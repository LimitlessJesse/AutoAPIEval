import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.ByteArrayInputStream;

public class SequenceInputStream_2 {
    public static void main(String[] args) {
        // Create input streams
        ByteArrayInputStream input1 = new ByteArrayInputStream("Hello".getBytes());
        ByteArrayInputStream input2 = new ByteArrayInputStream("World!".getBytes());

        // Create sequence input stream
        SequenceInputStream sequenceInput = new SequenceInputStream(input1, input2);

        int result;
        try {
            while ((result = sequenceInput.read())!= -1) {
                System.out.print((char) result);
            }

            // Close the sequence input stream
            sequenceInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
