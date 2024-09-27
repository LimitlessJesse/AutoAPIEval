import java.io.*;

public class SequenceInputStream_8 {
    public static void main(String[] args) throws IOException {
        InputStream is1 = new ByteArrayInputStream("Hello".getBytes());
        InputStream is2 = new ByteArrayInputStream("World".getBytes());
        SequenceInputStream sis = new SequenceInputStream(is1, is2);

        byte[] buffer = new byte[10];
        int bytesRead = sis.read(buffer, 0, buffer.length);

        while (bytesRead!= -1) {
            System.out.println(new String(buffer, 0, bytesRead));
            bytesRead = sis.read(buffer, 0, buffer.length);
        }

        sis.close();
    }
}
