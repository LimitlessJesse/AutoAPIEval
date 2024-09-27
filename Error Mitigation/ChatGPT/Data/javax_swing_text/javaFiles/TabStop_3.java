import javax.swing.text.TabStop;

public class TabStop_3 {
    public static void main(String[] args) {
        TabStop tabStop = new TabStop(100, TabStop.ALIGN_LEFT, TabStop.LEAD_NONE);
        int leader = tabStop.getLeader();
        System.out.println("Leader of the tab: " + leader);
    }
}
