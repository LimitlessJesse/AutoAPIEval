import java.util.HashSet;

public class HashSet_3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        System.out.println(set);

        // Using clear method
        set.clear();
        System.out.println(set);
    }
}
