import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_1 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> skipListSet = new ConcurrentSkipListSet<>();
        boolean added = skipListSet.add("Hello");
        System.out.println("Element added: " + added);
    }
}
