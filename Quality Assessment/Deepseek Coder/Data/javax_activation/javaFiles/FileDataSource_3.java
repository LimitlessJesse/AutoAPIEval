import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.InputStream;

public class FileDataSource_3 {
    public static void main(String[] args) {
        try {
            FileDataSource fileDataSource = new FileDataSource("path/to/file");
            InputStream inputStream = fileDataSource.getInputStream();
            
            int data;
            while ((data = inputStream.read())!= -1) {
                System.out.print((char) data);
            }
            
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
