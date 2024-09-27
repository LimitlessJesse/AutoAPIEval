import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream input1 = new FileInputStream("file1.txt");
            FileInputStream input2 = new FileInputStream("file2.txt");
            SequenceInputStream sequence = new SequenceInputStream(input1, input2);
            int data;
            while ((data = sequence.read()) != -1) {
                System.out.print((char) data);
            }
            sequence.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
