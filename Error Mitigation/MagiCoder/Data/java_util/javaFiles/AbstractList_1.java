import java.util.AbstractList;

public class AbstractList_1 {
    public static void main(String[] args) {
        AbstractList<String> list = new AbstractList<String>() {
            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

        boolean result = list.add("Hello");
        System.out.println(result);
    }
}
