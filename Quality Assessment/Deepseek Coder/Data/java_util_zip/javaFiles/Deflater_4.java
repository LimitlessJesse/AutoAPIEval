import java.util.zip.Deflater;

public class Deflater_4 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = "Hello, World!".getBytes();
        deflater.setInput(input);
        deflater.finish();
        int result;
        do {
            byte[] output = new byte[100];
            result = deflater.deflate(output);
            System.out.println("Deflated data: " + new String(output));
        } while (result!= Z_FINISH);
    }
}
