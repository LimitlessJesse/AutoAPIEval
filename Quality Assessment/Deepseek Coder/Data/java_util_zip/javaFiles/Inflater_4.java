import java.util.zip.Inflater;

public class Inflater_4 {
    public static void main(String[] args) {
        byte[] input = new byte[]{1, 2, 3, 4, 5};
        byte[] output = new byte[10];
        int offset = 0;
        int length = 10;

        Inflater inflater = new Inflater();
        inflater.setInput(input);
        int result = inflater.inflate(output, offset, length);

        System.out.println("Number of bytes inflated: " + result);
        System.out.println("Inflated bytes: " + new String(output));
    }
}
