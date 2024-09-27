import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStream_3 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69};
        try {
            CustomFilterOutputStream filterOutputStream = new CustomFilterOutputStream(System.out);
            filterOutputStream.write(data, 1, 3); // Writes from index 1 to index 3 (66, 67, 68) to the output stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class CustomFilterOutputStream extends FilterOutputStream {

        public CustomFilterOutputStream(OutputStream out) {
            super(out);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            for (int i = off; i < off + len; i++) {
                out.write(b[i]); // Writes each byte within the specified range to the output stream
            }
        }
    }
}
