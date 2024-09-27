import java.beans.XMLDecoder;
import java.beans.ExceptionListener;
import java.io.FileInputStream;
import java.io.IOException;

public class XMLDecoder_4 {
    public static void main(String[] args) {
        try {
            XMLDecoder decoder = new XMLDecoder(new FileInputStream("file.xml"));
            decoder.setExceptionListener(new ExceptionListener() {
                @Override
                public void exceptionThrown(Exception e) {
                    e.printStackTrace();
                }
            });
            // Continue with your decoding logic here
            decoder.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
