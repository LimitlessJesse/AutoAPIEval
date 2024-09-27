import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;

public class AbstractSequentialList_3 {
    public static void main(String[] args) {
        List<String> list = new AbstractSequentialList<String>() {
            private final List<String> list = new ArrayList<>();

            @Override
            public ListIterator<String> listIterator(int index) {
                return list.listIterator(index);
            }

            @Override
            public int size() {
                return list.size();
            }
        };

        list.add(0, "Hello");
        System.out.println(list);
    }
}
