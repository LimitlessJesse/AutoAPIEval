import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_1 {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            String s = "Hello, World!";
            byte[] bytes = s.getBytes();
            
            for (byte b : bytes) {
                bos.write(b);
            }
            
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
