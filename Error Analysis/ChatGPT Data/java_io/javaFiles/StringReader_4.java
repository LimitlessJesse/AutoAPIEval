import java.io.StringReader;

public class StringReader_4 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("This is a sample string.");
        try {
            int data = stringReader.read();
            System.out.println("Read data: " + (char)data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            stringReader.close();
        }
    }
}
