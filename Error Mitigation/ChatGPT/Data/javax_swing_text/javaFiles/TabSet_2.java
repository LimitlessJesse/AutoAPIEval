import javax.swing.text.TabStop;

public class TabSet_2 {
    public static void main(String[] args) {
        // Create a TabSet
        TabStop tab1 = new TabStop(50);
        TabStop tab2 = new TabStop(100);
        TabStop tab3 = new TabStop(150);
        
        TabStop[] tabs = {tab1, tab2, tab3};
        TabSet tabSet = new TabSet(tabs);
        
        // Get TabStop at index 1
        TabStop tabStop = tabSet.getTab(1);
        
        // Print the position of the TabStop
        System.out.println("TabStop position: " + tabStop.getPosition());
    }
}
