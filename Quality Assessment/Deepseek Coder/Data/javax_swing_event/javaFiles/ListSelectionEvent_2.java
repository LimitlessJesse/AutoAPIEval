import java.util.ListSelectionEvent;

public class ListSelectionEvent_2 {
    public static void main(String[] args) {
        ListSelectionEvent event = new ListSelectionEvent() {
            @Override
            public int getFirstIndex() {
                return 0;
            }

            @Override
            public int getLastIndex() {
                return 0;
            }

            @Override
            public int getValueIsAdjusting() {
                return 0;
            }
        };

        int lastIndex = event.getLastIndex();
        System.out.println("Last Index: " + lastIndex);
    }
}
