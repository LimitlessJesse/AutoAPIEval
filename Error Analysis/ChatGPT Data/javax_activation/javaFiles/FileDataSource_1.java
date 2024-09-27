import javax.activation.FileDataSource;
import java.io.*;

public class FileDataSource_1 {
    public static void main(String[] args) {
        try {
            FileDataSource fileDataSource = new FileDataSource("sample.txt");
            InputStream inputStream = fileDataSource.getInputStream();
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
