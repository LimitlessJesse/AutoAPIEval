import javax.swing.PopupFactory;

public class PopupFactory_3 {
    public static void main(String[] args) {
        PopupFactory factory = new PopupFactory();
        PopupFactory.setSharedInstance(factory);
    }
}
