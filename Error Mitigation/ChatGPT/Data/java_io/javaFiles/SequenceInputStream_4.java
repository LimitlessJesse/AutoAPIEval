import java.io.SequenceInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SequenceInputStream_4 {
    public static void main(String[] args) {
        try {
            FileInputStream input1 = new FileInputStream("file1.txt");
            FileInputStream input2 = new FileInputStream("file2.txt");
            
            SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);
            
            // Perform operations with the SequenceInputStream
            
            sequenceInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
