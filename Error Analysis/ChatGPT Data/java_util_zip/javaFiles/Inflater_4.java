import java.util.zip.Inflater;

public class Inflater_4 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        boolean isFinished = inflater.finished();
        System.out.println("Is finished: " + isFinished);
    }
}
