import javax.swing.event.ListDataEvent;

public class ListDataEvent_1 {
    public static void main(String[] args) {
        ListDataEvent event = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, 5);
        int index0 = event.getIndex0();
        System.out.println("Lower index value: " + index0);
    }
}
