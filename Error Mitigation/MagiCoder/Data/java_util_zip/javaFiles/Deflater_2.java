import java.util.zip.Deflater;

public class Deflater_2 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        byte[] input = {1, 2, 3, 4, 5};
        int offset = 0;
        int count = input.length;
        deflater.setInput(input, offset, count);
    }
}
