import java.util.Hashtable;

public class Hashtable_1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        
        System.out.println(getValue(hashtable, "One"));
    }
    
    public static Integer getValue(Hashtable<String, Integer> hashtable, String key) {
        return hashtable.get(key);
    }
}
