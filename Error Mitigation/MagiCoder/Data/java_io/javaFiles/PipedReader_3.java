import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReader_3 {
    public static void main(String[] args) {
        try {
            PipedReader pr = new PipedReader();
            PipedWriter pw = new PipedWriter();
            pr.connect(pw);
            pw.write("Hello, World!".toCharArray());
            int data = pr.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = pr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
