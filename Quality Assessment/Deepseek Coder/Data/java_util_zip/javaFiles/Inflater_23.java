import java.util.zip.Inflater;

public class Inflater_23 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        int remaining = inflater.availableIn();
        System.out.println("Remaining: " + remaining);
    }
}
