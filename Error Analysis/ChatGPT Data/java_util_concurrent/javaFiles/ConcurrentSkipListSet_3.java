import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_3 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Floor of 15: " + set.floor(15));
        System.out.println("Floor of 25: " + set.floor(25));
    }
}
