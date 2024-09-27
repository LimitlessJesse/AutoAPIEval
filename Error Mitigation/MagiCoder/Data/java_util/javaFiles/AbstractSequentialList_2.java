import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class AbstractSequentialList_2 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new AbstractSequentialList<String>() {
            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }
        };

        list.set(0, "Hello");
        System.out.println(list);
    }
}
