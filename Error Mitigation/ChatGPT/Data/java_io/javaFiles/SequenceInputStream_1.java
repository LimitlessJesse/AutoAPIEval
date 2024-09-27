import java.io.SequenceInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SequenceInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream input1 = new FileInputStream("file1.txt");
            FileInputStream input2 = new FileInputStream("file2.txt");
            
            SequenceInputStream sequenceInput = new SequenceInputStream(input1, input2);
            
            int data;
            while ((data = sequenceInput.read()) != -1) {
                System.out.print((char) data);
            }
            
            sequenceInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
