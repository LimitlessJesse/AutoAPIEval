import javax.swing.text.TabStop;
import javax.swing.text.TabSet;

public class TabSet_4 {
    public static void main(String[] args) {
        TabStop tabStop = new TabStop(100.0f, TabStop.ALIGN_RIGHT, TabStop.LEAD_DOTS);
        TabSet tabSet = new TabSet(new TabStop[]{tabStop});
        
        int hashCode = tabSet.hashCode();
        System.out.println("Hash code of tabSet: " + hashCode);
    }
}
