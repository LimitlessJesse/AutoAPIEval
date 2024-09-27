import javax.swing.text.TabStop;

public class TabStop_2 {
    public static void main(String[] args) {
        TabStop tabStop = new TabStop(50, TabStop.ALIGN_CENTER, TabStop.LEAD_NONE);
        int alignment = tabStop.getAlignment();
        System.out.println("Tab alignment: " + alignment);
    }
}
