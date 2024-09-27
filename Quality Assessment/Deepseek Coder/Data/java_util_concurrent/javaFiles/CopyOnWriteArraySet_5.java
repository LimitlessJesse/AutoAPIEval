import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_5 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        boolean isRemoved = set.remove("Hello");
        System.out.println("Is element removed? " + isRemoved);
        System.out.println("Set: " + set);
    }
}
