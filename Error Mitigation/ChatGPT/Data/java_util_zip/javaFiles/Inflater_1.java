import java.util.zip.Inflater;

public class Inflater_1 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        byte[] input = {120, -100, 75, 3, 0, 0, 0, 0, 4, 0, 0, -1};
        inflater.setInput(input, 0, input.length);
    }
}
