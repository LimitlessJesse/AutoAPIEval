import java.awt.event.KeyEvent;

public class KeyEvent_3 {
    public static void main(String[] args) {
        int keyCode = KeyEvent.VK_A; // Key code for 'A' key
        int keyLocation = KeyEvent.getKeyLocation(keyCode);

        switch (keyLocation) {
            case KeyEvent.KEY_LOCATION_STANDARD:
                System.out.println("The key is located in the standard position");
                break;
            case KeyEvent.KEY_LOCATION_LEFT:
                System.out.println("The key is located in the left position");
                break;
            case KeyEvent.KEY_LOCATION_RIGHT:
                System.out.println("The key is located in the right position");
                break;
            case KeyEvent.KEY_LOCATION_NUMPAD:
                System.out.println("The key is located in the numpad");
                break;
            case KeyEvent.KEY_LOCATION_UNKNOWN:
                System.out.println("The location of the key is unknown");
                break;
            default:
                System.out.println("Invalid key location");
                break;
        }
    }
}
