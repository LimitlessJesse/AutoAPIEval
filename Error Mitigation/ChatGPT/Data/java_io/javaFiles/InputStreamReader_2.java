import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamReader_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            
            String encoding = isr.getEncoding();
            System.out.println("Character encoding: " + encoding);
            
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
