import java.util.zip.InflaterInputStream;

public class Inflater_18 {
    public static void main(String[] args) {
        InflaterInputStream inflaterInputStream = new InflaterInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        int totalIn = inflaterInputStream.getTotalIn();
        System.out.println("Total input bytes: " + totalIn);
    }
}
