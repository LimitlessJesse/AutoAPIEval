import javax.swing.plaf.metal.MetalFileChooserUI;

public class MetalFileChooserUI_5 {
    public static void main(String[] args) {
        MetalFileChooserUI metalFileChooserUI = new MetalFileChooserUI(null);
        String fileName = metalFileChooserUI.getFileName();
        System.out.println("File Name: " + fileName);
    }
}
