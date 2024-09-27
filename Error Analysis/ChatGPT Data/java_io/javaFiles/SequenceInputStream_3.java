import java.io.SequenceInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SequenceInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream input1 = new FileInputStream("file1.txt");
            FileInputStream input2 = new FileInputStream("file2.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

            System.out.println(sequenceInputStream.available());

            sequenceInputStream.close();
            input1.close();
            input2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
