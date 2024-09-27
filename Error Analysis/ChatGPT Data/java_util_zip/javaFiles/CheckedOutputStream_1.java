import java.io.*;
import java.util.zip.CheckedOutputStream;

public class CheckedOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            CheckedOutputStream cos = new CheckedOutputStream(fos, new CRC32());
            cos.write(65); // writing byte value 65 to the output stream
            cos.flush();
            cos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
