import javax.print.attribute.standard.DialogTypeSelection;

public class DialogTypeSelection_3 {
    public static void main(String[] args) {
        DialogTypeSelection dialogTypeSelection = new DialogTypeSelection(DialogTypeSelection.CERTIFICATE);
        String name = dialogTypeSelection.getName();
        System.out.println("Selected dialog type: " + name);
    }
}
