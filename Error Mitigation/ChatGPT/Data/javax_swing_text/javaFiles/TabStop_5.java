import javax.swing.text.TabStop;

public class TabStop_5 {
    public static void main(String[] args) {
        TabStop tabStop = new TabStop(100, TabStop.ALIGN_LEFT, TabStop.LEAD_NONE);
        System.out.println(tabStop.toString());
    }
}
