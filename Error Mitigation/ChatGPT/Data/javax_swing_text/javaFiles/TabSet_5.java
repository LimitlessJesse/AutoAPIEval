import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

public class TabSet_5 {
    public static void main(String[] args) {
        TabStop tabStop1 = new TabStop(50);
        TabStop tabStop2 = new TabStop(100);
        
        TabSet tabSet = new TabSet(new TabStop[] {tabStop1, tabStop2});
        
        System.out.println(tabSet.toString());
    }
}
