import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_3 {
    public static void main(String[] args) {
        byte[] data = {(byte) 0x8b, (byte) 0x48, (byte) 0xcb, (byte) 0x51, (byte) 0x02, (byte) 0x03};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);

        try {
            int readByte;
            while ((readByte = inflaterInputStream.read())!= -1) {
                System.out.println(readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
