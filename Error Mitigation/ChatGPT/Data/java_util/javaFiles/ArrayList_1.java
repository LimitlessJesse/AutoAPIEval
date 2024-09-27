import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println("Before ensureCapacity: " + list.size());
        
        ((ArrayList<Integer>) list).ensureCapacity(10);
        
        System.out.println("After ensureCapacity: " + list.size());
    }
}
