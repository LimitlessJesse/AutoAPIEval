import javax.swing.JInternalFrame;

public class JInternalFrame_2 {
    public static void main(String[] args) {
        JInternalFrame internalFrame = new JInternalFrame();
        
        // Set the closable property to true
        internalFrame.setClosable(true);
        
        // Get the closable property
        boolean isClosable = internalFrame.isClosable();
        System.out.println("Is closable: " + isClosable);
    }
}
