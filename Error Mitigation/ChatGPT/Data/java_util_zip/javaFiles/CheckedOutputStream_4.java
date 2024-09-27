import java.util.zip.CheckedOutputStream;
import java.util.zip.Checksum;

public class CheckedOutputStream_4 {
    public static void main(String[] args) {
        CheckedOutputStream cos = new CheckedOutputStream(System.out, new CRC32());
        Checksum checksum = cos.getChecksum();
        System.out.println("Checksum value: " + checksum.getValue());
    }
}
