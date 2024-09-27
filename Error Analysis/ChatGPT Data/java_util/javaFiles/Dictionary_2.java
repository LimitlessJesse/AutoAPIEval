import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_2 {
    public static void main(String[] args) {
        Dictionary<Integer, String> dict = new Hashtable<>();
        dict.put(1, "Hello");
        System.out.println(dict.get(1));
    }
}
