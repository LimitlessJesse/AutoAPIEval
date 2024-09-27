import java.util.Dictionary;

public class Dictionary_5 {
    public static void main(String[] args) {
        Dictionary<Integer, String> dictionary = new java.util.Hashtable<>();
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");
        
        System.out.println("Size of the dictionary: " + dictionary.size());
    }
}
