import javax.swing.event.ListDataEvent;

public class ListDataEvent_2 {
    public static void main(String[] args) {
        ListDataEvent event = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, 5);
        int upperIndex = event.getIndex1();
        System.out.println("Upper Index: " + upperIndex);
    }
}
