import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_1 {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
            bos.write(65); // writing the byte value of 'A'
            bos.close();
            System.out.println("Byte written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
