import javax.swing.text.TabStop;

public class TabStop_3 {
    public static void main(String[] args) {
        TabStop tabStop = new TabStop(100, TabStop.ALIGN_RIGHT);
        int alignment = tabStop.getAlignment();
        System.out.println("TabStop alignment: " + alignment);
    }
}
