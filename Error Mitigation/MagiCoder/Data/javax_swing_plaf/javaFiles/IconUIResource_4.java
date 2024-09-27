import javax.swing.Icon;
import javax.swing.plaf.IconUIResource;

public class IconUIResource_4 {
    public static void main(String[] args) {
        Icon icon = new IconUIResource() {
            @Override
            public int getIconHeight() {
                return 100; // replace with your actual implementation
            }
        };

        int height = icon.getIconHeight();
        System.out.println("Icon height: " + height);
    }
}
