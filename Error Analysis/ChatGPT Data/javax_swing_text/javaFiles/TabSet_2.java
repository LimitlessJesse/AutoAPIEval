import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

public class TabSet_2 {
    public static void main(String[] args) {
        TabStop tab1 = new TabStop(100, TabStop.ALIGN_CENTER, TabStop.LEAD_NONE);
        TabStop tab2 = new TabStop(200, TabStop.ALIGN_DECIMAL, TabStop.LEAD_NONE);

        TabStop[] tabs = {tab1, tab2};
        TabSet tabSet = new TabSet(tabs);

        TabStop tabStop = tabSet.getTab(1);
        System.out.println("Tab position: " + tabStop.getPosition() + ", Alignment: " + tabStop.getAlignment());
    }
}
