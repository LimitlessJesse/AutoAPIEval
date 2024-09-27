import java.util.zip.Inflater;

public class Inflater_3 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        boolean needsInput = inflater.needsInput();
        System.out.println("Needs input: " + needsInput);
    }
}
