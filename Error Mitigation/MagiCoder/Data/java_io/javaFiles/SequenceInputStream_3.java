import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream_3 {
    public static void main(String[] args) {
        try {
            Vector<InputStream> streams = new Vector<>();
            streams.add(System.in);
            streams.add(System.in);
            Enumeration<InputStream> e = streams.elements();
            SequenceInputStream sis = new SequenceInputStream(e);
            int available = sis.available();
            System.out.println("Number of bytes available: " + available);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
