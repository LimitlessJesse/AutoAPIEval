import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionary_4 {
    public static void main(String[] args) {
        Dictionary<Integer, String> dictionary = new Hashtable<>();
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        
        Enumeration<String> values = dictionary.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
    }
}
