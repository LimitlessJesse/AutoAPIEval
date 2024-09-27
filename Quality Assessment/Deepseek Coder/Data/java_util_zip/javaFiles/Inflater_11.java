import java.util.zip.Inflater;
import java.util.zip.InflaterDictionary;

public class Inflater_11 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        InflaterDictionary dictionary = new InflaterDictionary(new byte[1024]);
        inflater.setDictionary(dictionary);
        boolean needsDictionary = inflater.needsDictionary();
        System.out.println("Needs Dictionary: " + needsDictionary);
    }
}
