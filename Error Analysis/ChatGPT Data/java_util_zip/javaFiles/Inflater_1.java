import java.util.zip.Inflater;

public class Inflater_1 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        byte[] input = {120, -100, 35, 23, 45, -67, 89, -12}; // input data in byte array
        int offset = 0; // starting offset for input data
        int length = input.length; // length of input data
        
        inflater.setInput(input, offset, length);
    }
}
