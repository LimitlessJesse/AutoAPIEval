import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream_1 {
    public static void main(String[] args) {
        InputStream inputStream = new InputStream() {
            // This is a dummy input stream that we will use for demonstration.
            // In a real-world scenario, you would use a FileInputStream or an URLConnection.InputStream.
            private int index = 0;
            private byte[] data = "Hello, World!".getBytes();

            @Override
            public int read() throws IOException {
                if (index == data.length) {
                    return -1;
                }
                return data[index++];
            }
        };

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        try {
            int readByte;
            while ((readByte = bufferedInputStream.read())!= -1) {
                System.out.print((char) readByte);
            }
            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
