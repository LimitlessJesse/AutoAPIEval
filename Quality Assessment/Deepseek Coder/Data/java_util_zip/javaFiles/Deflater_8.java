import java.util.zip.Deflater;

public class Deflater_8 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        boolean needsInput = deflater.needsInput();
        System.out.println("needsInput: " + needsInput);
    }
}
