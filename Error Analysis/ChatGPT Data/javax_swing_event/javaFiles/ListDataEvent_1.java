import javax.swing.event.ListDataEvent;

public class ListDataEvent_1 {
    public static void main(String[] args) {
        ListDataEvent event = new ListDataEvent(new Object(), ListDataEvent.CONTENTS_CHANGED, 0, 0);
        int index = event.getIndex0();
        System.out.println("Index 0: " + index);
    }
}
