import java.awt.Desktop;

public class Desktop_1 {
    public static void main(String[] args) {
        Desktop desktop = Desktop.getDesktop();
        boolean isSupported = desktop.isSupported(Desktop.Action.BROWSE);
        System.out.println("Is BROWSE action supported: " + isSupported);
    }
}
