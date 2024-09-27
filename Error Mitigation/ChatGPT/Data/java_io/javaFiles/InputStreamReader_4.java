import java.io.*;

public class InputStreamReader_4 {
    public static void main(String[] args) {
        char[] cbuf = new char[10];
        int offset = 0;
        int length = 5;
        
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("input.txt"))) {
            int numCharsRead = reader.read(cbuf, offset, length);
            
            if (numCharsRead != -1) {
                System.out.println("Characters read: " + numCharsRead);
                System.out.println("Data read: " + new String(cbuf, offset, numCharsRead));
            } else {
                System.out.println("End of stream reached");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
