import java.util.AbstractList;

public class AbstractList_1 {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.add("Hello");
        System.out.println(list.get(0));
    }

    static class MyCustomList<E> extends AbstractList<E> {
        private Object[] elements = new Object[10];
        private int size = 0;

        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            return (E) elements[index];
        }

        public boolean add(E e) {
            if (size == elements.length) {
                Object[] newElements = new Object[elements.length * 2];
                System.arraycopy(elements, 0, newElements, 0, elements.length);
                elements = newElements;
            }
            elements[size++] = e;
            return true;
        }

        public int size() {
            return size;
        }
    }
}
