import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_2 {
    public static void main(String[] args) {
        byte[] input = { 0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x00, 0x42, 0x43, 0x61, 0x52, 0x00, 0x03, 0x74, 0x65, 0x73, 0x74, 0x00, 0x00, 0x00 };
        byte[] output = new byte[1024];

        try {
            Inflater inflater = new Inflater();
            inflater.setInput(input, 10, input.length - 10);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InflaterOutputStream ios = new InflaterOutputStream(baos, inflater);

            ios.write(output, 0, output.length);
            ios.finish();

            byte[] result = baos.toByteArray();
            System.out.println(new String(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
