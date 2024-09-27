import javax.swing.event.ListDataEvent;

public class ListDataEvent_2 {
    public static void main(String[] args) {
        ListDataEvent event = new ListDataEvent(source, type, index0, index1);
        int index1 = event.getIndex1();
        System.out.println(index1);
    }
}
