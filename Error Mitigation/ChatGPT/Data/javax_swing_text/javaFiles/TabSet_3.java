import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

public class TabSet_3 {
    public static void main(String[] args) {
        TabStop tabStop1 = new TabStop(100);
        TabStop tabStop2 = new TabStop(200);
        
        TabSet tabSet1 = new TabSet(new TabStop[]{tabStop1, tabStop2});
        TabSet tabSet2 = new TabSet(new TabStop[]{tabStop1, tabStop2});
        
        System.out.println(tabSet1.equals(tabSet2)); // Output: true
    }
}
