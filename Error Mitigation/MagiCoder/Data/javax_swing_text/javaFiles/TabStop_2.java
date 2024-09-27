import javax.swing.text.TabStop;

public class TabStop_2 {
    public static void main(String[] args) {
        TabStop tabStop = new TabStop(10);
        int alignment = tabStop.getAlignment();
        System.out.println("Alignment: " + alignment);
    }
}
