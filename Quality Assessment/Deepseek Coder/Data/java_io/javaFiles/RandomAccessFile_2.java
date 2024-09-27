import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile_2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "r");
            byte[] b = new byte[1024];
            int bytesRead = raf.read(b);
            while (bytesRead!= -1) {
                System.out.println(new String(b, 0, bytesRead));
                bytesRead = raf.read(b);
            }
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
