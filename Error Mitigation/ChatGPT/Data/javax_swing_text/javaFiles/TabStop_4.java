import javax.swing.text.TabStop;

public class TabStop_4 {
    public static void main(String[] args) {
        TabStop tabStop1 = new TabStop(100);
        TabStop tabStop2 = new TabStop(100);
        
        boolean areEqual = tabStop1.equals(tabStop2);
        System.out.println("Are tab stops equal? " + areEqual);
    }
}
