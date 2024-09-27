import java.util.zip.Deflater;

public class Deflater_5 {
    public static void main(String[] args) {
        Deflater deflater = new Deflater();
        int strategy = Deflater.DEFAULT_STRATEGY; // Default strategy
        deflater.setStrategy(strategy);
    }
}
