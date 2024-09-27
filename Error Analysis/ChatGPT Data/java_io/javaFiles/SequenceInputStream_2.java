import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream_2 {
    public static void main(String[] args) {
        byte[] byteArray1 = {65, 66, 67};
        byte[] byteArray2 = {68, 69, 70};
        
        ByteArrayInputStream input1 = new ByteArrayInputStream(byteArray1);
        ByteArrayInputStream input2 = new ByteArrayInputStream(byteArray2);
        
        SequenceInputStream sequenceInput = new SequenceInputStream(input1, input2);
        
        byte[] buffer = new byte[5];
        int bytesRead = sequenceInput.read(buffer, 0, 5);
        
        System.out.println("Bytes read: " + bytesRead);
        System.out.print("Content read: ");
        for (int i = 0; i < bytesRead; i++) {
            System.out.print((char) buffer[i]);
        }
        
        sequenceInput.close();
    }
}
