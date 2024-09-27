import java.util.zip.Inflater;

public class Inflater_2 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        boolean inputNeeded = inflater.needsInput();
        System.out.println("Input needed: " + inputNeeded);
    }
}
