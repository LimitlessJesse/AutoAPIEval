import java.util.zip.Inflater;

public class Inflater_10 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        
        // Perform inflation here...
        
        boolean isFinished = inflater.finished();
        System.out.println("Inflater finished: " + isFinished);
    }
}
