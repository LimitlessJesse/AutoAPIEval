import javax.print.attribute.standard.DialogTypeSelection;

public class DialogTypeSelection_3 {
    public static void main(String[] args) {
        DialogTypeSelection dialogTypeSelection = DialogTypeSelection.COMMON_SETTINGS;
        String categoryName = dialogTypeSelection.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
