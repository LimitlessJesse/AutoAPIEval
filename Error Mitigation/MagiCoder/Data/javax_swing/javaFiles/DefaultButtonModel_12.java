import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_12 {
    public static void main(String[] args) {
        DefaultButtonModel model = new DefaultButtonModel();
        model.setMnemonic('A');
        int mnemonic = model.getMnemonic();
        System.out.println("Mnemonic: " + (char) mnemonic);
    }
}
