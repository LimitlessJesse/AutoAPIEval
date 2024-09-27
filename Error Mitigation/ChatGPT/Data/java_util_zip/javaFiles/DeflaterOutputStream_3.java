import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("compressed.txt");
            DeflaterOutputStream dos = new DeflaterOutputStream(fos);

            dos.write("Hello, World!".getBytes());
            dos.flush();

            dos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
