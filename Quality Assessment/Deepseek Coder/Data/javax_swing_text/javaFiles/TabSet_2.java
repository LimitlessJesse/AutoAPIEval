import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

public class TabSet_2 {
    public static void main(String[] args) {
        TabSet tabSet = new TabSet();
        tabSet.addTab(new TabStop(10));
        tabSet.addTab(new TabStop(20));
        tabSet.addTab(new TabStop(30));
        
        int tabCount = tabSet.getTabCount();
        System.out.println("Number of tabs: " + tabCount);
    }
}
